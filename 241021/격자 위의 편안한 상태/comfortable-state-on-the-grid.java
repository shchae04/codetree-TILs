import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N과 M 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // N x N 격자를 0으로 초기화 (색칠 여부를 추적)
        int[][] grid = new int[N][N];
        
        // 상하좌우 이동을 위한 델타 배열
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // M번의 색칠 작업에 대해 처리
        for (int i = 0; i < M; i++) {
            int r = scanner.nextInt() - 1; // 입력 좌표는 1부터 시작하므로 -1 처리
            int c = scanner.nextInt() - 1;
            
            // 현재 위치를 색칠 (1로 표시)
            grid[r][c] = 1;
            
            // 주변 4방향의 색칠된 칸 개수를 세기
            int adjacentColoredCount = 0;
            for (int d = 0; d < 4; d++) {
                int nr = r + dx[d];
                int nc = c + dy[d];
                
                // 유효한 격자 범위 내에 있고, 색칠되어 있으면 카운트
                if (nr >= 0 && nr < N && nc >= 0 && nc < N && grid[nr][nc] == 1) {
                    adjacentColoredCount++;
                }
            }
            
            // 주변 4칸 중 3칸이 색칠되어 있으면 '편안한 상태'
            if (adjacentColoredCount == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}