import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력
        int n = sc.nextInt();

        // 각 집에 살고 있는 사람 수 입력
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE; // 이동 거리의 합의 최솟값

        // 각 집을 기준으로 이동 거리의 합 계산
        for (int target = 0; target < n; target++) {
            int currentDistance = 0;

            for (int i = 0; i < n; i++) {
                currentDistance += arr[i] * Math.abs(target - i);
            }

            // 최솟값 갱신
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
            }
        }

        // 결과 출력
        System.out.println(minDistance);
    }
}