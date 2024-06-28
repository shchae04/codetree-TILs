import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str;

        // 문자열을 입력받습니다.
        str = sc.next();

        // 문자열의 길이를 구합니다.
        int len = str.length();

        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                // ASCII code 값을 숫자로 변환합니다.
                sum += str.charAt(i) - '0';
            }
        }

        System.out.println(sum);
        sc.close();
    }
}