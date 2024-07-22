import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 좌표 범위가 -100에서 100이므로, 201개의 요소를 가진 배열 생성
        int[] overlap = new int[201];
        
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt() + 100; // OFFESET 추가
            int end = scanner.nextInt() + 100;
            
            // 시작점부터 끝점 직전까지 겹침 횟수 증가
            for (int j = start; j < end; j++) {
                overlap[j]++;
            }
        }
        
        // 최대 겹침 횟수 찾기
        int maxOverlap = 0;
        for (int count : overlap) {
            maxOverlap = Math.max(maxOverlap, count);
        }
        
        System.out.println(maxOverlap);
        
        scanner.close();
    }
}