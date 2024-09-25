import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int n = sc.nextInt(); // 격자의 크기
        int t = sc.nextInt(); // 시간
        int r = sc.nextInt(); // 초기 행
        int c = sc.nextInt(); // 초기 열
        char d = sc.next().charAt(0); // 초기 방향
        
        // 방향에 따른 이동 (U, D, L, R)
        int[] dx = {0, 0, -1, 1}; // 상, 하, 좌, 우
        int[] dy = {-1, 1, 0, 0};
        
        int direction = 0;
        
        // 초기 방향 설정
        if (d == 'U') direction = 0;
        else if (d == 'D') direction = 1;
        else if (d == 'L') direction = 2;
        else if (d == 'R') direction = 3;
        
        // 시뮬레이션
        while (t > 0) {
            int nr = r + dy[direction];
            int nc = c + dx[direction];
            
            // 벽에 부딪힌 경우
            if (nr < 1 || nr > n) {
                direction = (direction == 0) ? 1 : 0; // 위 아래 방향 전환
            } else {
                r = nr; // 벽에 부딪히지 않았으면 이동
            }

            if (nc < 1 || nc > n) {
                direction = (direction == 2) ? 3 : 2; // 좌우 방향 전환
            } else {
                c = nc; // 벽에 부딪히지 않았으면 이동
            }
            
            // 시간 감소
            t--;
        }
        
        // 결과 출력
        System.out.println(r + " " + c);
    }
}