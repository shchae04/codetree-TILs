import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calc(a,b);
        System.out.println(result);
    }

    public static int calc(int a, int b){
        int cnt = 0;
        for(int i=a; i<=b; i++){
            if(func1(i) || i % 3 == 0){  
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean func1(int n){
        int temp = 0;
        while(n > 0){
            temp = n % 10;
            if(temp == 3 || temp == 6 || temp == 9){
                return true;
            }
            n /= 10;
        }
        return false; 
    }
}