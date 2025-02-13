import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();
        int[] fields = new int[N];
        for (int i = 0; i < N; i++) {
            fields[i] = sc.nextInt();
        }
        
        // 각 밭을 H로 맞추기 위해 필요한 비용을 구함 (절댓값)
        int[] costArr = new int[N];
        for (int i = 0; i < N; i++) {
            costArr[i] = Math.abs(fields[i] - H);
        }
        
        // prefix sum 배열을 만듭니다.
        int[] prefix = new int[N + 1];
        prefix[0] = 0;
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + costArr[i];
        }
        
        int ans = Integer.MAX_VALUE;
        // 모든 연속 구간에 대해, 길이가 T 이상인 구간의 비용을 계산합니다.
        for (int i = 0; i < N; i++) {
            for (int j = i + T - 1; j < N; j++) {
                int currentCost = prefix[j + 1] - prefix[i];
                ans = Math.min(ans, currentCost);
            }
        }
        
        // 결과 출력
        System.out.println(ans);
        
        sc.close();
    }
}
