import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];  // 1부터 100까지의 범위를 커버

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            
            // 시작점부터 끝점까지(끝점 포함) 겹침 횟수 증가
            for (int j = x1; j <= x2; j++) {
                arr[j]++;
            }
        }

        int maxOverlap = 0;
        for (int i = 1; i <= 100; i++) {  // 1부터 100까지만 확인
            if (arr[i] > maxOverlap) {
                maxOverlap = arr[i];
            }
        }

        System.out.println(maxOverlap);
    }
}