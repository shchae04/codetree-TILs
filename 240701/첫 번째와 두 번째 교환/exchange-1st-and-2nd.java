import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();
        
        // 첫 번째와 두 번째 문자를 가져옵니다.
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ch1) {
                result.append(ch2);
            } else if (currentChar == ch2) {
                result.append(ch1);
            } else {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }
}