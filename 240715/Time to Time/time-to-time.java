import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//시
        int b = sc.nextInt();//분
        
        int c = sc.nextInt();//시
        int d = sc.nextInt();//분

        //0시0분에서 흐른 시간 계산 
        int beforeMin = a * 60 + b;
        int afterMin = c * 60 + d;

        System.out.println(afterMin - beforeMin);

     
    }
}