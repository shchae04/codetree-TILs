import java.util.Scanner;

public class Main {
    public static int F(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (n % 2 == 0) { // 짝수
            return 1 + F(n / 2);
        } else { // 홀수
            return 1 + F(n / 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
    }
}