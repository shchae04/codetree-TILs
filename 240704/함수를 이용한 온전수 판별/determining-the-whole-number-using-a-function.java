import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc(a,b));
    }

    //온전수 판단.
    public static int calc(int a, int b){
        
        int cnt = 0;
        for(int i=a; i<=b; i++){
            if(isRight(i)){
                cnt++;
            }
        }

        return cnt;
    }

    public static boolean isRight(int n) {
    return n % 2 != 0 &&        // 2로 나누어 떨어지지 않음
           n % 10 != 5 &&       // 일의 자리가 5가 아님
           !(n % 3 == 0 && n % 9 != 0);  // 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 경우가 아님
}
}