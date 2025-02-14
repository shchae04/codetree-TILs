import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int total = N * N * N;
        int countA = 0, countB = 0, countC = 0;
        
        // 각 자리별로 |x - 주어진 숫자|가 3 이상인 경우의 수 계산
        for (int x = 1; x <= N; x++) {
            if (Math.abs(x - a) >= 3) countA++;
        }
        for (int x = 1; x <= N; x++) {
            if (Math.abs(x - b) >= 3) countB++;
        }
        for (int x = 1; x <= N; x++) {
            if (Math.abs(x - c) >= 3) countC++;
        }
        
        int closed = countA * countB * countC;
        System.out.println(total - closed);
    }
}
