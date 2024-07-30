import java.util.Scanner;
public class Main {

    public static int n,m;
    public static int[] posA = new int[1000001];
    public static int[] posB = new int[1000001];


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        //A의 위치 기록
        int timeA = 1;
        for(int i=0; i<n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while(t--> 0){
                if(d == 'R'){
                    posA[timeA] = posA[timeA - 1] + 1;
                } else {
                    posA[timeA] = posA[timeA -1] - 1;
                }

                timeA++;
            }
        }

        //B의 위치 기록
        int timeB = 1;
        for(int i=0; i<m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while(t--> 0){
                if(d == 'R'){
                    posB[timeB] = posB[timeB - 1] + 1;
                } else {
                    posB[timeB] = posB[timeB -1] - 1;
                }

                timeB++;
            }
        }

        //최초 시간
        int meet = -1;
        for(int i=1; i<timeA; i++){
            if(posA[i] == posB[i]){
                meet = i;
                break;
            }
        }

        System.out.println(meet);

    }
}