import java.util.Scanner;

public class Main {
    // 인접한 상하좌우 칸을 나타내는 배열
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 격자의 크기
        int[][] grid = new int[n][n];
        
        // 격자 상태 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int count = 0;
        
        // 각 칸에 대해 상하좌우 인접한 칸을 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int adjacentOnes = 0; // 인접한 칸에서 1의 개수

                // 상하좌우 인접한 칸을 체크
                for (int k = 0; k < 4; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    // 격자 범위를 벗어나지 않으면 체크
                    if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                        if (grid[ni][nj] == 1) {
                            adjacentOnes++;
                        }
                    }
                }

                // 인접한 칸에 1이 3개 이상이면 카운트 증가
                if (adjacentOnes >= 3) {
                    count++;
                }
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}