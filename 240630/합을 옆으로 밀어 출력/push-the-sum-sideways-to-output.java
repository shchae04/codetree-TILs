import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        String sumStr = Integer.toString(sum);

        String result = sumStr.substring(1) + sumStr.charAt(0);

        System.out.println(result);

        sc.close();
    }
}