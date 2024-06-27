import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String str = sc.next();
        
        // 첫 번째와 두 번째 문자 저장
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        
        // StringBuilder 사용하여 문자열 수정
        StringBuilder temp = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch2) {
                temp.setCharAt(i, ch1);
            }
        }
        
        // 결과 출력
        System.out.println(temp.toString());
    }
}