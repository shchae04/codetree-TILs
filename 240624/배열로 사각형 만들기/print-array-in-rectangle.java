public class Main {
    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];

        // 1. 첫 번째 행과 첫 번째 열에 1을 채운다.
        for (int i = 0; i < 5; i++) {
            arr2d[0][i] = 1; // 첫 번째 행 초기화
            arr2d[i][0] = 1; // 첫 번째 열 초기화
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr2d[i][j] = arr2d[i - 1][j] + arr2d[i][j - 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}