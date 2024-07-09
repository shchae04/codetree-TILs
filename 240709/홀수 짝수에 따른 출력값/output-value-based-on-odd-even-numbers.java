import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(F(n));
    }

    public static int F(int n){

        if(n <= 0){
            return 0;
        }
        
        if(n % 2 ==0){ //짝수 1 ~ n 까지 짝수의 합
            return n + F(n-2);
        } else { //홀수 1 ~ n 까지 홀수의 합
            return n + F(n-2);
        }
    }
}