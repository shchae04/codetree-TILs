import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 항상 홀수
        int num = 1; // 초기값 1부터 시작
        int[][] matrix = new int[n][n];
        sc.close();

        // 초기 좌표 설정
        int x = n / 2;
        int y = n / 2;

        // 방향: 동(오른쪽), 북(위), 서(왼쪽), 남(아래)
        int[] dr = {0, -1, 0, 1};
        int[] dc = {1, 0, -1, 0};
        int direction = 0; // 처음 방향은 동쪽

        // 중앙에 첫 숫자 설정
        matrix[x][y] = num++;

        // 나선형으로 채워나가는 과정
        int step = 1;  // 각 방향으로 움직일 횟수
        while (num <= n * n) {
            for (int i = 0; i < 2; i++) {  // 각 방향으로 두 번씩 반복 (동쪽->북쪽, 서쪽->남쪽)
                for (int j = 0; j < step; j++) {  // step만큼 이동
                    x += dr[direction];
                    y += dc[direction];
                    matrix[x][y] = num++;
                }
                direction = (direction + 1) % 4;  // 방향 변경
            }
            step++;  // 한 사이클이 끝날 때마다 step 증가
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