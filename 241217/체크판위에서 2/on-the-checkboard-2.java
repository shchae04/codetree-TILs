import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        String[][] grid = new String[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next();
            }
        }

        // 시작점 색상
        String startColor = grid[0][0];
        // 도착점 색상
        String endColor = grid[R-1][C-1];

        int count = 0;

        // 첫 번째 중간점 (r2,c2)
        for (int r2 = 1; r2 < R-1; r2++) {
            for (int c2 = 1; c2 < C-1; c2++) {
                String mid1Color = grid[r2][c2];
                
                // 시작->중간1 점프 조건: 색이 달라야 함
                if (startColor.equals(mid1Color)) {
                    continue;
                }

                // 두 번째 중간점 (r3,c3)
                for (int r3 = r2+1; r3 < R; r3++) {
                    for (int c3 = c2+1; c3 < C; c3++) {
                        // 끝 점에 도달하기 위해 마지막 점프가 가능하려면 r3 < R-1, c3 < C-1 이어야 한다.
                        // 다만 마지막 점프 목표는 (R-1, C-1)이므로 r3는 R-2까지, c3는 C-2까지 확인
                        if (r3 == R-1 && c3 == C-1) {
                            // (r3, c3)가 마지막 점프 지점 자체가 되어버리므로 여기서는 패스
                            // 마지막 점프는 (r3,c3)에서 (R-1,C-1)이므로 r3<R-1, c3<C-1 조건 필요
                            continue;
                        }
                        
                        if (r3 < R-1 && c3 < C-1) {
                            String mid2Color = grid[r3][c3];

                            // 중간1->중간2 점프 색상 조건
                            if (mid1Color.equals(mid2Color)) {
                                continue;
                            }

                            // 마지막 점프 (중간2->끝) 색상 조건
                            if (mid2Color.equals(endColor)) {
                                continue;
                            }

                            // 점프 가능 조건(행 증가, 열 증가)은 이미 루프 설계로 보장됨
                            // 조건 모두 만족 시 카운트 증가
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
