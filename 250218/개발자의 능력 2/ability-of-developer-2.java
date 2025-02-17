import java.util.*;
public class Main {
    static int minDiff = Integer.MAX_VALUE; // 최소 차이를 저장할 변수
    static int[] abilities = new int[6];    // 6명의 능력치 배열
    static boolean[] used = new boolean[6];   // 개발자 배정 여부 체크

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            abilities[i] = sc.nextInt();
        }
        backtrack(0, new ArrayList<>());
        System.out.println(minDiff);
    }

    // depth: 현재까지 만들어진 팀의 수, teamSums: 각 팀의 능력치 합 저장 리스트
    static void backtrack(int depth, List<Integer> teamSums) {
        // 모든 팀이 구성된 경우 (총 3팀)
        if (depth == 3) {
            int max = Collections.max(teamSums);
            int min = Collections.min(teamSums);
            minDiff = Math.min(minDiff, max - min);
            return;
        }

        // 아직 배정되지 않은 첫 번째 개발자 선택
        int first = -1;
        for (int i = 0; i < 6; i++) {
            if (!used[i]) {
                first = i;
                break;
            }
        }
        used[first] = true;  // 선택된 개발자를 배정 처리

        // first 개발자와 짝이 될 수 있는 다른 개발자 선택
        for (int j = first + 1; j < 6; j++) {
            if (!used[j]) {
                used[j] = true;
                teamSums.add(abilities[first] + abilities[j]); // 팀의 능력치 합 저장
                backtrack(depth + 1, teamSums); // 다음 팀 구성으로 재귀 호출
                teamSums.remove(teamSums.size() - 1); // 백트래킹: 마지막 팀 제거
                used[j] = false; // 짝을 이루었던 개발자 배정 취소
            }
        }
        used[first] = false; // 첫 번째 개발자의 배정 취소
    }
}
