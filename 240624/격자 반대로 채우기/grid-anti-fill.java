import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        int num = 1;
        for (int i = n - 1; i >= 0; i--) { //3 2 1 0
            if ((n - 1 - i) % 2 == 0) { // 0 1 2 3
                for (int j = n - 1; j >= 0; j--) { //3 2 1 0
                    grid[j][i] = num++; //[3][3] [3][2] [3][1] [3][0] 위로 증가
                }
            } else {
                for (int j = 0; j < n; j++) {
                    grid[j][i] = num++; //[2][0] [2][1] [2][2] [2][3]  아래로 증가
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