import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위함
        int n = scanner.nextInt(); //n
        int m = scanner.nextInt(); //m
        scanner.close(); //입력 종료

        char[][] matrix = new char[n][m]; // n * m 배열을 담을 배열 선언
        int[] dr = {0, 1, 0, -1}; // 방향 배열: 오른쪽, 아래, 왼쪽, 위 //행
        int[] dc = {1, 0, -1, 0}; //열

        char currentChar = 'A'; // A 부터 시작
        int row = 0, col = 0, direction = 0; // 0,0 에서 시작 방향도 0

        for (int i = 0; i < n * m; i++) { // 0 ~ n * m
            matrix[row][col] = currentChar; 
            currentChar = (char) ((currentChar - 'A' + 1) % 26 + 'A'); // A ~ Z 까지 순환.

            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || matrix[nextRow][nextCol] != '\0') {
                /*
                nextRow < 0: 다음 이동할 행(nextRow)이 0보다 작은 경우 (즉, 행렬의 위쪽 경계를 벗어난 경우).

                nextRow >= n: 다음 이동할 행(nextRow)이 행렬의 총 행 수 n보다 크거나 같은 경우 (즉, 행렬의 아래쪽 경계를 벗어난 경우).

                nextCol < 0: 다음 이동할 열(nextCol)이 0보다 작은 경우 (즉, 행렬의 왼쪽 경계를 벗어난 경우).

                nextCol >= m: 다음 이동할 열(nextCol)이 행렬의 총 열 수 m보다 크거나 같은 경우 (즉, 행렬의 오른쪽 경계를 벗어난 경우).

                matrix[nextRow][nextCol] != '\0': 다음 이동할 위치(matrix[nextRow][nextCol])에 이미 값이 채워져 있는 경우 (즉, 빈 공간이 아닌 경우).
                */
                direction = (direction + 1) % 4; // 방향 전환
                /*
                오른쪽으로 이동하면서 행렬의 오른쪽 경계에 도달하거나, 이미 값이 채워진 위치에 도달하면 direction이 1이 되어 아래쪽으로 방향 전환합니다.
                아래쪽으로 이동하다가 경계에 도달하거나 값이 채워진 위치에 도달하면 direction이 2가 되어 왼쪽으로 방향 전환합니다.
                왼쪽으로 이동하다가 경계에 도달하거나 값이 채워진 위치에 도달하면 direction이 3이 되어 위쪽으로 방향 전환합니다.
                위쪽으로 이동하다가 다시 경계나 값이 채워진 위치에 도달하면 direction이 0이 되어 오른쪽으로 이동으로 돌아갑니다.
                */
                nextRow = row + dr[direction];
                nextCol = col + dc[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        // 출력
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