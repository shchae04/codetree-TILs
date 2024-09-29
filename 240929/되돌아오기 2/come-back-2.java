import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 4;
    
    public static String dirs;
    public static int x = 0, y = 0;
    public static int currDir = 3;
    
    // 동, 남, 서, 북 순으로 dx, dy를 정의합니다.
    public static int[] dx = new int[]{1,  0, -1, 0};
    public static int[] dy = new int[]{0, -1,  0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        dirs = sc.next();
        
        // flag : 시작점으로 되돌아 왔는지 여부
        boolean flag = false;
        
        // 움직이는 것을 진행합니다.
        for(int i = 0; i < (int) dirs.length(); i++) {
            char cDir = dirs.charAt(i);
            
            // 반시계방향 90' 회전
            if(cDir == 'L')
                currDir = (currDir - 1 + 4) % 4;
            // 시계방향 90' 회전
            else if(cDir == 'R')
                currDir = (currDir + 1) % 4;
            // 직진
            else {
                x += dx[currDir];
                y += dy[currDir];
            }
            
            // 시작점으로 되돌아왔을 때
            if(x == 0 && y == 0) {
                System.out.print(i + 1);
                flag = true;
                break;
            }
        }
        
        //시작점으로 되돌아오지 못했을 때
        if(flag == false)
            System.out.print(-1);
        
    }
}