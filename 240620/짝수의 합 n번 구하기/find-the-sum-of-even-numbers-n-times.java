import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // Step 1:
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int j = a; j <= b; j++){
                if(j % 2 == 0){
                    sum += j;
                }
            }
            System.out.println(sum);
            
        }
        
    }
}