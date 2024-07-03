import java.util.Scanner;

public class Main {
    public static int calcSumPrime(int a, int b) {
        int sum = 0;
        for (int i = Math.max(2, a); i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calcSumPrime(a, b);

        System.out.println(result);
    }
}