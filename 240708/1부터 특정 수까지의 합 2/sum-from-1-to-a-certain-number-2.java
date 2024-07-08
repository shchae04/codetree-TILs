import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = calc(n);
        System.out.println(result);
    }

    public static int calc(int n) {
        if (n <= 1) {
            return n;
        }
        return n + calc(n - 1);
    }
}