import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 2D 배열 생성
        int[][] grid = new int[n][n];
        
        // 시작 위치 (가운데)
        int centerX = n / 2;
        int centerY = n / 2;
        
        // 방향 배열 (오른쪽, 위, 왼쪽, 아래)
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        
        // 현재 위치
        int x = centerX;
        int y = centerY;
        
        // 숫자 1부터 시작
        int num = 1;
        grid[x][y] = num++;
        
        // 각 방향으로 이동할 거리
        int len = 1;
        
        // 전체 채워야 할 칸 수
        int total = n * n;
        
        while (num <= total) {
            // 같은 길이로 두 번씩 이동 (오른쪽-위, 왼쪽-아래)
            for (int i = 0; i < 2; i++) {
                // 각 방향으로 이동
                for (int dir = 0; dir < 4; dir++) {
                    // 현재 방향으로 지정된 길이만큼 이동
                    for (int j = 0; j < len; j++) {
                        // 다음 위치 계산
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        
                        // 범위를 벗어나거나 이미 숫자가 있으면 건너뛰기
                        if (nx < 0 || nx >= n || ny < 0 || ny >= n || grid[nx][ny] != 0) {
                            continue;
                        }
                        
                        // 다음 위치로 이동하고 숫자 채우기
                        x = nx;
                        y = ny;
                        grid[x][y] = num++;
                    }
                }
            }
            // 이동 거리 증가
            len++;
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                if (j < n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}