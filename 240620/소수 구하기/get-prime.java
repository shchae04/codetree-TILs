import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // Step 1:
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            // Case 1:
            if(cnt == 2){
                System.out.print(i + " ");
            }
        }
        
    }
}