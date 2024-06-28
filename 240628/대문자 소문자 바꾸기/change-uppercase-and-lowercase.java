import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //대문자
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c + 32);
            } else if(c >= 'a' && c <= 'z'){
                c = (char)(c - 32);
            }
            sb.append(c);    
        }

        System.out.print(sb.toString());
    }
}