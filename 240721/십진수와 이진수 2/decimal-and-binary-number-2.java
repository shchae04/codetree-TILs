import java.util.Scanner;

public class Main {
    public static final int MAX_DIGIT = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        String binary = sc.next();
        
        // 십진수로 변환합니다.
        int num = 0;
        for(int i = 0; i < (int) binary.length(); i++)
            num = num * 2 + (binary.charAt(i) - '0');
        
        // 십진수에 17을 곱합니다.
        num *= 17;
        
        // 이진수로 변환합니다.
        int[] digits = new int[MAX_DIGIT];
        int cnt = 0;
        
        while(true) {
            if(num < 2) {
                digits[cnt++] = num;
                break;
            }
            
            digits[cnt++] = num % 2;
            num /= 2;
        }
        
        // 배열의 순서를 뒤집어 이진수를 출력합니다.
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);

    }
}