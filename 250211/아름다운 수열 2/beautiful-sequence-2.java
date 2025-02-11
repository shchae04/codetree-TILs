import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열 A의 길이
        int M = sc.nextInt(); // 수열 B의 길이

        int[] arrN = new int[N];
        int[] arrM = new int[M];

        // 수열 A 입력
        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }

        // 수열 B 입력
        for (int i = 0; i < M; i++) {
            arrM[i] = sc.nextInt();
        }

        // 수열 B의 빈도수 맵 생성
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int num : arrM) {
            targetMap.put(num, targetMap.getOrDefault(num, 0) + 1);
        }

        int count = 0; // 아름다운 수열 개수

        // 초기 윈도우의 빈도수 맵 생성
        Map<Integer, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            windowMap.put(arrN[i], windowMap.getOrDefault(arrN[i], 0) + 1);
        }

        // 첫 윈도우 비교
        if (windowMap.equals(targetMap)) {
            count++;
        }

        // 슬라이딩 윈도우 적용
        for (int i = M; i < N; i++) {
            // 윈도우에 새 요소 추가
            windowMap.put(arrN[i], windowMap.getOrDefault(arrN[i], 0) + 1);

            // 윈도우에서 가장 오래된 요소 제거
            int oldElement = arrN[i - M];
            windowMap.put(oldElement, windowMap.get(oldElement) - 1);
            if (windowMap.get(oldElement) == 0) {
                windowMap.remove(oldElement);
            }

            // 현재 윈도우와 타겟 비교
            if (windowMap.equals(targetMap)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
