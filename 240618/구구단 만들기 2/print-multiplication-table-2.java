import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 각 행에 대해 반복하여 출력
        for (int i = 2; i <= 8; i += 2) {
            // 각 열은 b부터 a까지 감소하는 순서로 출력
            for (int j = b; j >= a; j--) {
                System.out.print(j + " * " + i + " = " + (j * i));
                // 맨 마지막 곱셈 결과에는 / 출력하지 않음
                if (j > a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}