import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int OFFSET = 1000;
        final int SIZE = OFFSET * 2 + 1;
        int[][] arr = new int[SIZE][SIZE];
        
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 직사각형 좌표 입력
        int x1_1 = scanner.nextInt() + OFFSET;
        int y1_1 = scanner.nextInt() + OFFSET;
        int x1_2 = scanner.nextInt() + OFFSET;
        int y1_2 = scanner.nextInt() + OFFSET;

        // 첫 번째 직사각형 표시
        for (int i = x1_1; i < x1_2; i++) {
            for (int j = y1_1; j < y1_2; j++) {
                arr[i][j] = 1;
            }
        }

        // 두 번째 직사각형 좌표 입력
        int x2_1 = scanner.nextInt() + OFFSET;
        int y2_1 = scanner.nextInt() + OFFSET;
        int x2_2 = scanner.nextInt() + OFFSET;
        int y2_2 = scanner.nextInt() + OFFSET;

        // 두 번째 직사각형 표시
        for (int i = x2_1; i < x2_2; i++) {
            for (int j = y2_1; j < y2_2; j++) {
                arr[i][j] = 2;
            }
        }

        int minX = SIZE, minY = SIZE, maxX = 0, maxY = 0;
        boolean exist = false;

        // 첫 번째 직사각형의 남아 있는 부분을 찾기
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == 1) {
                    exist = true;
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 남아 있는 부분의 넓이 출력
        if (exist) {
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        } else {
            System.out.println(0);
        }
    }
}