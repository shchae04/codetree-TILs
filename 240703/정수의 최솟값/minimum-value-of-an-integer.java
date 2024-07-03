import java.util.Scanner;

public class Main {

    public static void calc(int a, int b, int c) {
        int result = 0;
        if(a < b && a < c)
        result = a;
        if(b < a && b < c)
        result = b;
        if(c < a && c < b)
        result = c;

        System.out.println(result);
    }

    public static void main(String[] args) {
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calc(a,b,c);
    }
}