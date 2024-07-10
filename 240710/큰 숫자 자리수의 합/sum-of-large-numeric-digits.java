import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        //마지막 자릿수 + 10으로 나눈 몫으로 다시 계산 
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        long product = (long) num1 * num2 * num3;

        int sum = sumOfDigits((int) product);

        // 결과를 출력합니다.
        System.out.println(sum);
    }
}