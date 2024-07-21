import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        while (N > 0) {
            int remainder = N % B;
            result.insert(0, remainder);  // 나머지를 결과의 맨 앞에 추가
            N /= B;
        }
        
        System.out.println(result.toString());
    }
}