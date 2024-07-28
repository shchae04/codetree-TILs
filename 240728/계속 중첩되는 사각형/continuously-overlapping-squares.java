import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] grid = new int[201][201]; // -100 to 100 range
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            
            int color = (i % 2) + 1; // 1 for red, 2 for blue
            
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = color;
                }
            }
        }
        
        int blueArea = 0;
        for (int x = 0; x < 201; x++) {
            for (int y = 0; y < 201; y++) {
                if (grid[x][y] == 2) { // blue
                    blueArea++;
                }
            }
        }
        
        System.out.println(blueArea);
        sc.close();
    }
}