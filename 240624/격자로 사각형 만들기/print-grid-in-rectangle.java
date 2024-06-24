import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0) {
                    arr[i][j] = 1; // 행, 열 1로 세팅
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i][j-1];
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}