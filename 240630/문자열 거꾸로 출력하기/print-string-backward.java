import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 종료 조건 문자열
        String temp = "END";
        
        for (int i = 0; i < 10; i++) {
            String str = sc.next();

            if (str.equals(temp)) {
                break;
            }

            // 문자열을 뒤집어 출력합니다.
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }

        
    }
}