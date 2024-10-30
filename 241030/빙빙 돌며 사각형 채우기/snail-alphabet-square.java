import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        char[][] matrix = new char[n][m];
        int[] dr = {0, 1, 0, -1}; // 방향 배열: 오른쪽, 아래, 왼쪽, 위
        int[] dc = {1, 0, -1, 0};

        char currentChar = 'A';
        int row = 0, col = 0, direction = 0;

        for (int i = 0; i < n * m; i++) {
            matrix[row][col] = currentChar;
            currentChar = (char) ((currentChar - 'A' + 1) % 26 + 'A');

            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || matrix[nextRow][nextCol] != '\0') {
                direction = (direction + 1) % 4; // 방향 전환
                nextRow = row + dr[direction];
                nextCol = col + dc[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
                if (j < m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}