import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2 * n + 1; i++) {
    if (i % 2 == 0) {
        // 짝수 행에는 별을 모두 출력
        for (int j = 0; j < 2 * n + 1; j++) {
            System.out.print("* ");
        }
    } else {
        // 홀수 행에는 별을 공백과 함께 출력
        for (int j = 0; j < n + 1; j++) {
            System.out.print("*   ");
        }
    }
    System.out.println();
}

    }
}