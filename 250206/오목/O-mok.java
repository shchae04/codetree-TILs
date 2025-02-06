import java.util.*;

public class Main {

    //인접한 8개의 칸
    public static final int DIR_NUM = 8;

    public static int[][] arr = new int[19][19];

    // 왼쪽 아래 -> 아래 -> 오른쪽 아래 -> 왼쪽 위 -> 위 -> 오른쪽 위 -> 왼쪽 -> 오른쪽 탐색

    //19 * 19 격자 내부 판단 in_range
    public static int[] dx = new int[]{1,1,1,-1,-1,-1,0,0};
    public static int[] dy = new int[]{-1,0,1,-1,0,1,-1,1};

    public static boolean inRange(int x, int y){
        return 0 <= x && x < 19 && 0 <= y && y<19;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 확인
        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                if(arr[i][j] == 0){
                    continue;
                }

                for(int k=0; k<DIR_NUM; k++){
                    int curt = 1;
                    int curx = i;
                    int cury = j;
                    while(true){
                        int nx = curx + dx[k];
                        int ny = cury + dy[k];

                        if(inRange(nx, ny) == false) break;

                        if(arr[nx][ny] != arr[i][j]) break;

                        curt++;
                        curx = nx;
                        cury = ny;
                    }

                    if(curt == 5){
                        System.out.println(arr[i][j]);
                        System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                        System.exit(0);
                    }
                }
            }
        }

        System.out.print(0);
    }

}