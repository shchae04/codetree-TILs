import java.util.Scanner;

public class Main {
    public static final int MAX_DIGIT = 30;
    
    public static int a, b;
    public static String n;
    public static int[] digits = new int[MAX_DIGIT];
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 입력
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.next();
        
        // 십진수로 변환합니다.
        int num = 0;
        for(int i = 0; i < n.length(); i++)
            num = num * a + (n.charAt(i) - '0');
        
        // b진수로 변환합니다.
        while(true) {
            if(num < b) {
                digits[cnt++] = num;
                break;
            }
            
            digits[cnt++] = num % b;
            num /= b;
        }
        
        // 진수 배열을 뒤집어 b진수를 출력합니다.
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
        
    }
}