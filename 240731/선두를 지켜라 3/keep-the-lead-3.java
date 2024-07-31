import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        List<int[]> movesA = new ArrayList<>();
        List<int[]> movesB = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            movesA.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        
        for (int i = 0; i < M; i++) {
            movesB.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        
        long posA = 0, posB = 0;
        int indexA = 0, indexB = 0;
        int timeA = 0, timeB = 0;
        int changes = 0;
        String lastLead = "";
        
        while (indexA < N && indexB < M) {
            if (timeA == 0) {
                int[] moveA = movesA.get(indexA);
                posA += (long)moveA[0] * moveA[1];
                timeA = moveA[1];
                indexA++;
            }
            
            if (timeB == 0) {
                int[] moveB = movesB.get(indexB);
                posB += (long)moveB[0] * moveB[1];
                timeB = moveB[1];
                indexB++;
            }
            
            String currentLead;
            if (posA > posB) currentLead = "A";
            else if (posB > posA) currentLead = "B";
            else currentLead = "AB";
            
            if (!currentLead.equals(lastLead)) {
                changes++;
                lastLead = currentLead;
            }
            
            int minTime = Math.min(timeA, timeB);
            timeA -= minTime;
            timeB -= minTime;
        }
        
        System.out.println(changes+1);
    }
}