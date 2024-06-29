import java.util.Scanner;

public class Main {
    // 숫자만 추출하는 함수
    public static int extractNumbers(String s) {
        StringBuilder number = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }
        }
        return Integer.parseInt(number.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String str1 = scanner.nextLine().trim();
        String str2 = scanner.nextLine().trim();
        
        // 숫자 추출
        int num1 = extractNumbers(str1);
        int num2 = extractNumbers(str2);
        
        // 숫자 합산
        int result = num1 + num2;
        
        // 결과 출력
        System.out.println(result);
        
        scanner.close();
    }
}