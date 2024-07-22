import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt(); // 칸의 개수
        int K = scanner.nextInt(); // 명령의 개수
        
        // 각 칸의 블록 수를 저장할 배열
        int[] blocks = new int[N + 1]; // 1부터 N까지 사용
        
        // K개의 명령 처리
        for (int i = 0; i < K; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            // A부터 B까지 각 칸에 블록 추가
            for (int j = A; j <= B; j++) {
                blocks[j]++;
            }
        }
        
        // 최댓값 찾기
        int maxBlocks = 0;
        for (int i = 1; i <= N; i++) {
            maxBlocks = Math.max(maxBlocks, blocks[i]);
        }
        
        // 결과 출력
        System.out.println(maxBlocks);
        
        scanner.close();
    }
}