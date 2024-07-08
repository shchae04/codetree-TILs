import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(squareSum(n));
        scanner.close();
    }

    public static long squareSum(long n) {
        if (n == 0) {
            return 0;
        } else {
            long digit = n % 10;
            return (digit * digit) + squareSum(n / 10);
        }
    }
}