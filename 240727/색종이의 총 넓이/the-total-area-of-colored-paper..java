import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[][] papers = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            papers[i][0] = scanner.nextInt();
            papers[i][1] = scanner.nextInt();
        }
        
        System.out.println(calculateTotalArea(N, papers));
        
        scanner.close();
    }
    
    public static int calculateTotalArea(int N, int[][] papers) {
        boolean[][] plane = new boolean[201][201];
        
        for (int[] paper : papers) {
            int x = paper[0] + 100;
            int y = paper[1] + 100;
            
            for (int i = x; i < x + 8; i++) {
                for (int j = y; j < y + 8; j++) {
                    plane[i][j] = true;
                }
            }
        }
        
        int totalArea = 0;
        for (boolean[] row : plane) {
            for (boolean cell : row) {
                if (cell) totalArea++;
            }
        }
        
        return totalArea;
    }
}