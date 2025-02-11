import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열 A의 길이
        int M = sc.nextInt(); // 수열 B의 길이

        if (N < M) { // N이 M보다 작으면 아름다운 수열이 존재할 수 없음
            System.out.println(0);
            return;
        }

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

        int matched = 0; // targetMap과 windowMap에서 일치하는 요소 개수
        for (int key : targetMap.keySet()) {
            if (targetMap.get(key).equals(windowMap.getOrDefault(key, 0))) {
                matched++;
            }
        }

        // 첫 윈도우 비교
        if (matched == targetMap.size()) {
            count++;
        }

        // 슬라이딩 윈도우 적용
        for (int i = M; i < N; i++) {
            int newElement = arrN[i];
            int oldElement = arrN[i - M];

            // 새 요소 추가 처리
            int prevCountNew = windowMap.getOrDefault(newElement, 0);
            windowMap.put(newElement, prevCountNew + 1);

            if (targetMap.containsKey(newElement)) {
                if (prevCountNew == targetMap.get(newElement)) {
                    matched--;
                }
                if (prevCountNew + 1 == targetMap.get(newElement)) {
                    matched++;
                }
            }

            // 오래된 요소 제거 처리
            int prevCountOld = windowMap.get(oldElement);
            windowMap.put(oldElement, prevCountOld - 1);

            if (targetMap.containsKey(oldElement)) {
                if (prevCountOld == targetMap.get(oldElement)) {
                    matched--;
                }
                if (prevCountOld - 1 == targetMap.get(oldElement)) {
                    matched++;
                }
            }

            if (windowMap.get(oldElement) == 0) {
                windowMap.remove(oldElement);
            }

            // 모든 요소가 일치하는 경우
            if (matched == targetMap.size()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
