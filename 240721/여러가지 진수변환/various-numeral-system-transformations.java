import java.util.Scanner;

public class Main {
    public static final int MAX_DIGIT = 20;
    
    public static int n, b;
    public static int[] digits = new int[MAX_DIGIT];
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        b = sc.nextInt();
        
        // b진수로 변환합니다.
        while(true) {
            if(n < b) {
                digits[cnt++] = n;
                break;
            }
            
            digits[cnt++] = n % b;
            n /= b;
        }
        
        // 진수 배열을 뒤집어 b진수를 출력합니다.
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
        
    }
}