import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에 N을 입력 받습니다.
        int N = scanner.nextInt();
        
        // 수열을 입력받을 배열을 생성합니다.
        int[] arr = new int[N];
        
        // N개의 숫자를 입력받습니다.
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int ans = 0;
        int cnt = 0;
        for(int i=0; i<N; i++){
            if(i >= 1 && arr[i] - arr[i-1] > 0)
                cnt++;
            else
                cnt = 1;

            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
        
       
    }
}