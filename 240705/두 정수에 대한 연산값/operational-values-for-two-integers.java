import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer A = a;
        Integer B = b;
        calc(A,B);
    }

    public static void calc(Integer a, Integer b){
        if(a>b){
            a= a + 25;
            b = b * 2;
        } else {
            b = b +25;
            a = a *2;
        }
        System.out.println(a + " " + b);
    }
}