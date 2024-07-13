import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Rday[] arr = new Rday[n];
        LocalDate earliestDate = null;

        // 전체 데이터 입력받기
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            LocalDate localDate = LocalDate.parse(date);
            arr[i] = new Rday(localDate, day, weather);

            // 가장 빠른 날짜 찾기
            if (earliestDate == null || localDate.isBefore(earliestDate)) {
                earliestDate = localDate;
            }
        }

        // 가장 가까운 비 오는 날 찾기
        Rday closestRainDay = null;
        for (Rday rday : arr) {
            if (rday.weather.equals("Rain") && 
                (closestRainDay == null || rday.date.isBefore(closestRainDay.date)) && 
                !rday.date.isBefore(earliestDate)) {
                closestRainDay = rday;
            }
        }

        // 출력
        if (closestRainDay != null) {
            System.out.println(closestRainDay.date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + 
                               " " + closestRainDay.day + " " + closestRainDay.weather);
        }
    }
}

class Rday {
    LocalDate date;
    String day;
    String weather;
    
    public Rday(LocalDate date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}