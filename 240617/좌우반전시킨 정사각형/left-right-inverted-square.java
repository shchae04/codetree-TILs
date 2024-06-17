import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
         int n = (new Scanner(System.in)).nextInt();
        
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}