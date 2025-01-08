import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int n = sc.nextInt(); // 방의 개수
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt(); // 각 방에 들어가야 할 인원 수
        }

        // 최소 거리 합 계산
        int minDistance = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) { // 각 방을 시작점으로 설정
            int totalDistance = 0;

            for (int i = 0; i < n; i++) {
                // 시계 반대 방향 거리 계산
                int distance = (i - start + n) % n; // 원형 구조에서 거리 계산
                totalDistance += distance * people[i];
            }

            // 최소 거리 합 갱신
            minDistance = Math.min(minDistance, totalDistance);
        }

        // 결과 출력
        System.out.println(minDistance);

        sc.close();
    }
}
