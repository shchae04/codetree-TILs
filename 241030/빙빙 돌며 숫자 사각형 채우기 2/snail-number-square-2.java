import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        int[] dx = {1, 0, -1, 0}; // 아래, 오른쪽, 위, 왼쪽 순서
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0, dir = 0;

        for (int i = 1; i <= n * m; i++) {
            matrix[x][y] = i;
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 경계를 벗어나거나 이미 방문한 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || matrix[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}