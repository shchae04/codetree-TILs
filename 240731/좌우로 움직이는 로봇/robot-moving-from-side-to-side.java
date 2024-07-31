import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] movesA = new int[n][2];
        int[][] movesB = new int[m][2];
        
        for (int i = 0; i < n; i++) {
            movesA[i][0] = sc.nextInt();
            movesA[i][1] = sc.next().equals("L") ? -1 : 1;
        }
        
        for (int i = 0; i < m; i++) {
            movesB[i][0] = sc.nextInt();
            movesB[i][1] = sc.next().equals("L") ? -1 : 1;
        }
        
        System.out.println(countMeetings(movesA, movesB));
    }
    
    public static int countMeetings(int[][] movesA, int[][] movesB) {
        int posA = 0, posB = 0;
        int indexA = 0, indexB = 0;
        int remainA = 0, remainB = 0;
        int count = 0;
        int time = 0;
        boolean lastDifferent = false;
        
        while (indexA < movesA.length || indexB < movesB.length || remainA > 0 || remainB > 0) {
            time++;
            
            if (remainA == 0 && indexA < movesA.length) {
                remainA = movesA[indexA][0];
                indexA++;
            }
            if (remainB == 0 && indexB < movesB.length) {
                remainB = movesB[indexB][0];
                indexB++;
            }
            
            if (remainA > 0) {
                posA += movesA[indexA - 1][1];
                remainA--;
            }
            if (remainB > 0) {
                posB += movesB[indexB - 1][1];
                remainB--;
            }
            
            if (posA == posB && lastDifferent && time > 1) {
                count++;
            }
            
            lastDifferent = (posA != posB);
        }
        
        return count;
    }
}