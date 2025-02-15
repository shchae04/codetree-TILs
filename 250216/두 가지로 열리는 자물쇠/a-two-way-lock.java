import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] comb1 = new int[3];
        int[] comb2 = new int[3];
        
        // 첫 번째 조합 입력
        for (int i = 0; i < 3; i++) {
            comb1[i] = sc.nextInt();
        }
        // 두 번째 조합 입력
        for (int i = 0; i < 3; i++) {
            comb2[i] = sc.nextInt();
        }
        
        int count = 0;
        // 모든 가능한 조합에 대해 검사 (1 ≤ a, b, c ≤ n)
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (isClose(a, comb1[0], n) && isClose(b, comb1[1], n) && isClose(c, comb1[2], n)) {
                        count++;
                    } else if (isClose(a, comb2[0], n) && isClose(b, comb2[1], n) && isClose(c, comb2[2], n)) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
    
    // 다이얼의 숫자 a와 조합의 숫자 b의 원형 거리가 2 이내이면 true 반환
    public static boolean isClose(int a, int b, int n) {
        int diff = Math.abs(a - b);
        diff = Math.min(diff, n - diff);
        return diff <= 2;
    }
}
