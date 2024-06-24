import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int[][] arr2d = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            int num = 1;
                for (int j = 0; j<n; j++) {
                    arr2d[i][j] = i + num;
                    num+=n;
                }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}