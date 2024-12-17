import java.io.*;
import java.util.*;

public class Main {
    static int R, C;
    static char[][] grid;
    static int[][][][] memo;
    
    public static void main(String[] args) throws IOException {
        // Input parsing
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        grid = new char[R][C];
        
        // Read grid
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                grid[i][j] = st.nextToken().charAt(0);
            }
        }
        
        // Memoization array: 
        // [start row][start col][prev row][prev col]
        memo = new int[R][C][R][C];
        for (int[][][] layer3D : memo) {
            for (int[][] layer2D : layer3D) {
                for (int[] row : layer2D) {
                    Arrays.fill(row, -1);
                }
            }
        }
        
        // Calculate and print result
        int result = countValidJumps(0, 0, -1, -1, 0);
        System.out.println(result);
    }
    
    // DFS with memoization
    static int countValidJumps(int row, int col, int prevRow, int prevCol, int jumps) {
        // Base case: reached destination
        if (row == R - 1 && col == C - 1) {
            return jumps == 2 ? 1 : 0;
        }
        
        // Out of bounds
        if (row >= R || col >= C) {
            return 0;
        }
        
        // Check memoized result
        if (prevRow != -1 && memo[row][col][prevRow][prevCol] != -1) {
            return memo[row][col][prevRow][prevCol];
        }
        
        int totalPaths = 0;
        
        // Try jumping to every possible location
        for (int nr = row + 1; nr < R; nr++) {
            for (int nc = col + 1; nc < C; nc++) {
                // Check color change rule
                if (prevRow == -1 || 
                    (grid[prevRow][prevCol] != grid[row][col] && 
                     grid[row][col] != grid[nr][nc])) {
                    
                    // Recursively count paths
                    int paths = countValidJumps(nr, nc, row, col, 
                                                prevRow == -1 ? 0 : jumps + 1);
                    totalPaths += paths;
                }
            }
        }
        
        // Memoize the result
        if (prevRow != -1) {
            memo[row][col][prevRow][prevCol] = totalPaths;
        }
        
        return totalPaths;
    }
}