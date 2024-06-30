import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 문자열을 공백을 기준으로 입력받습니다.
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        // 첫 번째 문자열에서 숫자 부분을 추출합니다.
        String str1 = parts[0];
        String num1 = "";
        for (char c : str1.toCharArray()) {
            if (Character.isDigit(c)) {
                num1 += c;
            } else {
                break;
            }
        }

        // 두 번째 문자열에서 숫자 부분을 추출합니다.
        String str2 = parts[1];
        String num2 = "";
        for (char c : str2.toCharArray()) {
            if (Character.isDigit(c)) {
                num2 += c;
            } else {
                break;
            }
        }

        // 추출한 숫자 부분을 정수로 변환하고 합을 계산합니다.
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1 + number2;

        // 결과를 출력합니다.
        System.out.println(sum);

        // 스캐너 객체를 닫습니다.
        sc.close();
    }
}