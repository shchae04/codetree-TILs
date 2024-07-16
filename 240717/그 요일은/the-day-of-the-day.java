import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String A = sc.nextLine();
        sc.close();
        
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int targetDayIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(A)) {
                targetDayIndex = i;
                break;
            }
        }

        LocalDate startDate = LocalDate.of(2024, m1, d1);
        LocalDate endDate = LocalDate.of(2024, m2, d2);
        
        int count = 0;

        while (!startDate.isAfter(endDate)) {
            int dayOfWeek = startDate.getDayOfWeek().getValue() - 1; // 월요일을 0으로 맞추기
            if (dayOfWeek == targetDayIndex) {
                count++;
            }
            startDate = startDate.plusDays(1);
        }
        
        System.out.println(count);
    }
}