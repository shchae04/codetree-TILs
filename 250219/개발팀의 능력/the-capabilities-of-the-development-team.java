import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[5];
        for (int i = 0; i < 5; i++) {
            ability[i] = sc.nextInt();
        }
        
        int result = Integer.MAX_VALUE;
        
        // 5명 중 누구를 1인 팀으로 할지 선택 (인덱스 i)
        for (int i = 0; i < 5; i++) {
            int singleton = ability[i];
            
            // 나머지 4명의 인덱스를 리스트에 담음
            ArrayList<Integer> others = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                if(j != i) others.add(j);
            }
            
            // 4명 중에서 2명을 골라 첫번째 2인 팀을 만든다.
            // 나머지 2명이 두번째 2인 팀이 된다.
            int size = others.size(); // 4
            for (int a = 0; a < size; a++) {
                for (int b = a + 1; b < size; b++) {
                    // 첫 번째 팀: others[a]와 others[b]
                    int team1 = ability[others.get(a)] + ability[others.get(b)];
                    
                    // 남은 두 명이 두 번째 팀
                    ArrayList<Integer> remain = new ArrayList<>();
                    for (int idx = 0; idx < size; idx++) {
                        if (idx != a && idx != b) {
                            remain.add(others.get(idx));
                        }
                    }
                    int team2 = ability[remain.get(0)] + ability[remain.get(1)];
                    
                    // 세 팀의 능력치가 모두 달라야 함.
                    if(team1 == team2 || team1 == singleton || team2 == singleton)
                        continue;
                    
                    // 세 팀 능력치 중 최대와 최소를 구함.
                    int max = Math.max(team1, Math.max(team2, singleton));
                    int min = Math.min(team1, Math.min(team2, singleton));
                    int diff = max - min;
                    
                    result = Math.min(result, diff);
                }
            }
        }
        
        // 가능한 경우가 없다면 -1 출력
        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }
}
