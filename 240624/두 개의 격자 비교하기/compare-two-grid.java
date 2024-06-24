import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // 2차원 배열을 구현합니다.
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] arr3 = new int[n][m];

        // 첫 번째 배열의 입력을 받습니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr1[i][j] = sc.nextInt();

        // 두 번째 배열의 입력을 받습니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr2[i][j] = sc.nextInt();

        // 두 배열의 곱을 새로운 배열에 담습니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(arr1[i][j] == arr2[i][j]){
                    arr3[i][j] = 0;
                } else {
                    arr3[i][j] = 1;
                }

        // 새로운 배열을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }
}