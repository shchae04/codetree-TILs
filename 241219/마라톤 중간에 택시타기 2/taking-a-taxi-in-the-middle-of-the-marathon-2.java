import java.util.*;

public class Main {
    
    // dist 메서드를 클래스 내부에 static 메서드로 선언
    static int dist(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] points = new int[N][2];
        
        for(int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        // 원래 경로의 총 거리
        int total = 0;
        for(int i = 0; i < N-1; i++) {
            total += dist(points[i], points[i+1]);
        }

        int minDistance = Integer.MAX_VALUE;

        // 2 ~ N-1 중 하나를 건너뛴다고 가정
        for (int j = 1; j < N-1; j++) {
            int original = dist(points[j-1], points[j]) + dist(points[j], points[j+1]);
            int skip = dist(points[j-1], points[j+1]);

            int newTotal = total - original + skip;
            if (newTotal < minDistance) {
                minDistance = newTotal;
            }
        }

        System.out.println(minDistance);
        sc.close();
    }
}
