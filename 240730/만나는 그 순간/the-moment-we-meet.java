import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // A와 B의 위치를 저장할 배열
        int[] posA = new int[100001];  // 최대 이동 시간을 고려한 배열 크기
        int[] posB = new int[100001];

        int time = 0;
        int positionA = 0;
        int positionB = 0;

        // A의 움직임 처리
        for (int i = 0; i < N; i++) {
            String direction = sc.next();
            int duration = sc.nextInt();
            
            int move = direction.equals("R") ? 1 : -1;
            
            for (int j = 0; j < duration; j++) {
                positionA += move;
                posA[time + j + 1] = positionA;
            }
            
            time += duration;
        }

        // B의 움직임 처리
        time = 0;
        for (int i = 0; i < M; i++) {
            String direction = sc.next();
            int duration = sc.nextInt();
            
            int move = direction.equals("R") ? 1 : -1;
            
            for (int j = 0; j < duration; j++) {
                positionB += move;
                posB[time + j + 1] = positionB;
            }
            
            time += duration;
        }

        // 만나는 시간 찾기
        for (int i = 1; i <= time; i++) {
            if (posA[i] == posB[i]) {
                System.out.println(i);
                return;
            }
        }

        // 만나지 않는 경우
        System.out.println(-1);
    }
}