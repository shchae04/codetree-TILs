import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 격자 크기
        int m = scanner.nextInt(); // 점의 개수

        int[][] grid = new int[n][n]; // 격자 배열 초기화

        for (int i = 1; i <= m; i++) {
            int r = scanner.nextInt(); // 점의 행 위치
            int c = scanner.nextInt(); // 점의 열 위치
            grid[r - 1][c - 1] = r *c; // 점 번호 부여
        }

        // 격자 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}