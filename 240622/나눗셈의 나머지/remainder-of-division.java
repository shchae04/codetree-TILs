import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arrCount = new int[10];
        int i;

        while (a > 1) {
            i = a % b;
            arrCount[i]++;


            a /= b;
        }

        int result = 0;
        for (int count : arrCount) {
            result += count * count;
        }
        System.out.println(result);

        sc.close();
    }
}