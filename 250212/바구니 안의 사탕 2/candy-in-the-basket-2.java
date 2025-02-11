import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N: 바구니의 개수, K: 구간 반경
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // 각 바구니의 사탕 개수와 위치 저장
        int[] candies = new int[N];
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        
        int maxCandies = 0;
        // 바구니의 위치가 0 이상 100 이하이므로, 후보 중심 c를 충분히 커버하도록
        // c를 -K부터 100+K까지 검사합니다.
        for (int c = -K; c <= 100 + K; c++) {
            int sum = 0;
            int left = c - K;
            int right = c + K;
            // 모든 바구니에 대해, 해당 바구니의 위치가 [c-K, c+K] 구간 내에 있으면 사탕 개수를 합산
            for (int i = 0; i < N; i++) {
                if (positions[i] >= left && positions[i] <= right) {
                    sum += candies[i];
                }
            }
            maxCandies = Math.max(maxCandies, sum);
        }
        
        System.out.println(maxCandies);
        sc.close();
    }
}
