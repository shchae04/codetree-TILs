import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 격자의 크기 n과 동전의 개수 m 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 격자 초기화
        int[][] grid = new int[n][n];
        
        // 동전의 위치 입력 받기
        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            grid[r - 1][c - 1] = 1; // 동전 위치에 1로 표시
        }
        
        // 격자 상태 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}