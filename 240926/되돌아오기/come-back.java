import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int x = 0, y = 0;  // 시작 위치 (0, 0)
        int time = 0;  // 걸린 시간
        
        for (int i = 0; i < N; i++) {
            String direction = scanner.next();  // 방향 입력
            int distance = scanner.nextInt();   // 이동 거리 입력
            
            // 각 방향에 따른 좌표 변화
            for (int d = 0; d < distance; d++) {
                if (direction.equals("N")) {
                    y += 1;  // 북쪽으로 이동 (y 증가)
                } else if (direction.equals("S")) {
                    y -= 1;  // 남쪽으로 이동 (y 감소)
                } else if (direction.equals("E")) {
                    x += 1;  // 동쪽으로 이동 (x 증가)
                } else if (direction.equals("W")) {
                    x -= 1;  // 서쪽으로 이동 (x 감소)
                }
                
                time++;  // 1초 증가
                
                // 현재 위치가 (0, 0)인지 확인
                if (x == 0 && y == 0) {
                    System.out.println(time);
                    return;
                }
            }
        }
        
        // 끝까지 돌아오지 못한 경우
        System.out.println(-1);
    }
}