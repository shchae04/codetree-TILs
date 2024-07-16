import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 날짜 (m1, d1)와 두 번째 날짜 (m2, d2) 입력 받기
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String A = sc.nextLine();
        sc.close();
        
        // 요일 맵핑
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 요일 인덱스 찾기
        int targetDayIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(A)) {
                targetDayIndex = i;
                break;
            }
        }

        // 시작 날짜와 끝 날짜 설정 (2024년 기준)
        LocalDate startDate = LocalDate.of(2024, m1, d1);
        LocalDate endDate = LocalDate.of(2024, m2, d2);
        
        int count = 0;

        // 날짜 반복
        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek().getValue() % 7 == targetDayIndex) {
                count++;
            }
            startDate = startDate.plusDays(1);
        }
        
        // 결과 출력
        System.out.println(count);
    }
}