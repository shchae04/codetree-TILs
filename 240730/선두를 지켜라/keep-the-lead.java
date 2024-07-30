import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int winner = 'C';
        int time = 0;

        int[] a = new int[1000001];
        int[] b = new int[1000001];

        int aTime = 1;
        int bTime = 1;

        for (int i = 0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            time += t;

            for (int j = 0; j<t; j++){
                a[aTime] = a[aTime-1] + v;
                aTime++;
            }   
        }
        for (int i = 0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j<t; j++){
                b[bTime] = b[bTime-1] + v;
                bTime++;
            }   
        }

        for (int i = 1 ;i<=time; i++){
            if(a[i]  > b[i]){
                if(winner == 'B') cnt++;
                winner = 'A';
            }
            else if( b[i]>a[i]){
                if(winner == 'A') cnt++;
                winner = 'B';
            }
        }
        System.out.print(cnt);
    }
}