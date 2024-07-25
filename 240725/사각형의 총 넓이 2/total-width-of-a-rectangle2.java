import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 좌표 범위가 -100 ~ 100이므로 201x201 크기의 배열 생성
        boolean[][] plane = new boolean[201][201];
        
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            
            // 직사각형 영역 표시
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    plane[x][y] = true;
                }
            }
        }
        
        // 표시된 영역 계산
        int area = 0;
        for (int x = 0; x < 201; x++) {
            for (int y = 0; y < 201; y++) {
                if (plane[x][y]) {
                    area++;
                }
            }
        }
        
        System.out.println(area);
    }
}