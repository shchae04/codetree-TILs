import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        int num = 1;
        for (int i = n - 1; i >= 0; i--) {
            if ((n - 1 - i) % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    grid[j][i] = num++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    grid[j][i] = num++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}