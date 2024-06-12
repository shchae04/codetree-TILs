import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double ex = (double)(a+b)/(a-b); // 13/7
        System.out.printf("%.2f", ex);
    }
}