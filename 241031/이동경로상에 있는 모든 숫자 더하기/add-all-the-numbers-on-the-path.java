import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //홀수
        int T = sc.nextInt();

        // T개의 명령어 배열을 한 번에 문자열로 입력받아 문자 배열로 변환
        char[] command = sc.next().toCharArray();

        //격자 정보 지정
        int[][] matrix = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //방향 지정 행, 열 기준
        int[] dx = {-1,0,1,0}; // 북 동 남 서
        int[] dy = {0,1,0,-1};
        int direction = 0; // 북쪽 

        //가운데 위치에서 북쪽을 향한 상태로 움직이는 것을 시작한다.
        int x = N/2;
        int y = N/2;

        //경로에 있는 숫자의 합 초기값(중앙 값)
        int count = matrix[x][y]; 

        for(int i=0; i<T; i++){
            if(command[i] == 'L'){
                //왼쪽 회전
                direction = (direction + 3) % 4; //북이 0 서는 3 direction + 3 
            } else if(command[i] == 'R') {
                //오른쪽 회전
                direction = (direction + 1) % 4;
            } else {
                //앞으로 한칸 이동
                int newX = x + dx[direction];
                int newY = y + dy[direction];

                //격자 범위 내 이동
                if(newX >= 0 && newX < N && newY >= 0 && newY < N){
                    x = newX;
                    y = newY;
                    count += matrix[x][y];
                }
            }
        }

        System.out.println(count);
        sc.close();

        

    }
}