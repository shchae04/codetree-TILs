import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int x = n / 2;
        int y = n / 2;
        matrix[x][y] = 1;

        int num = 2;
        int step = 1;

        while (num <= n * n) {
            // 오른쪽으로 이동
            for (int i = 0; i < step && num <= n * n; i++) {
                y++;
                matrix[x][y] = num++;
            }
            // 위로 이동
            for (int i = 0; i < step && num <= n * n; i++) {
                x--;
                matrix[x][y] = num++;
            }
            step++;
            // 왼쪽으로 이동
            for (int i = 0; i < step && num <= n * n; i++) {
                y--;
                matrix[x][y] = num++;
            }
            // 아래로 이동
            for (int i = 0; i < step && num <= n * n; i++) {
                x++;
                matrix[x][y] = num++;
            }
            step++;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}