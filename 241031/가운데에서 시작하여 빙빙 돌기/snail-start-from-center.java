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

        // 반복하여 숫자를 채워나감
        for (int i = 1; i < n * n; i++) {
            // 다음 위치
            int newX = x + dr[direction];
            int newY = y + dc[direction];

            // 범위를 벗어나지 않고 빈칸이라면 해당 위치에 숫자를 채움
            if (newX >= 0 && newX < n && newY >= 0 && newY < n && matrix[newX][newY] == 0) {
                x = newX;
                y = newY;
                matrix[x][y] = num++;
            } else {
                // 빈칸이 아닐 경우 방향을 바꿈
                direction = (direction + 1) % 4;
                i--; // 다시 시도하도록 인덱스 유지
            }
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