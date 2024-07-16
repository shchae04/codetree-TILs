import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.close();
        
        // 2011년 각 월의 일수를 배열로 저장
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 첫 번째 날짜로부터 총 일수 계산
        int days1 = 0;
        for (int i = 1; i < m1; i++) {
            days1 += daysInMonth[i];
        }
        days1 += d1;

        // 두 번째 날짜로부터 총 일수 계산
        int days2 = 0;
        for (int i = 1; i < m2; i++) {
            days2 += daysInMonth[i];
        }
        days2 += d2;
        
        // 두 날짜 사이의 일수 차이 계산
        int difference = days2 - days1;
        
        // 첫 번째 날짜의 요일 (0: Mon, 1: Tue, ..., 6: Sun)
        int dayOfWeek = 0;  // 2011년 1월 1일이 월요일이므로 0으로 설정
        
        // 두 번째 날짜의 요일 계산
        int resultDayOfWeek = (dayOfWeek + difference) % 7;
        if (resultDayOfWeek < 0) {
            resultDayOfWeek += 7;
        }
        
        // 요일 배열
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        // 결과 출력
        System.out.println(days[resultDayOfWeek]);
    }
}