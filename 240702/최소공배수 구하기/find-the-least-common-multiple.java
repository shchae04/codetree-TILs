import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //최소 공배수 계산
        int result = calc(n,m);
        System.out.println(result);
    }
    //최대 공약수 계산
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; //6, 2, 0
            a = temp; //temp = 2  a = 2
        }
        return a;
    }

    // 최소공배수 계산
    public static int calc(int n, int m) {
        return (n * m) / gcd(n, m);
    }
}