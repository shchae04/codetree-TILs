import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N (size of grid)
        int N = scanner.nextInt();
        
        // Initialize the grid
        int[][] grid = new int[N][N];
        
        // Input grid data
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        // Variable to keep track of the maximum coins
        int maxCoins = 0;

        // Iterate through each row and check all possible 1x3 subgrids
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - 3; j++) { // Ensure we don't go out of bounds
                int currentCoins = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                maxCoins = Math.max(maxCoins, currentCoins);
            }
        }

        // Output the maximum coins found
        System.out.println(maxCoins);

        scanner.close();
    }
}