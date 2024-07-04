import java.util.Scanner;

public class Main {
    // 날짜 존재 여부를 확인하는 함수
    public static boolean isValidDate(int month, int day) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month < 1 || month > 12) {
            return false;
        }
        
        return day >= 1 && day <= daysInMonth[month - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        
        // 날짜 검증
        if (isValidDate(month, day)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}