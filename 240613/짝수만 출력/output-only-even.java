import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int a, b;
        int i;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        i = a;

        // 출력
        while(i <= b) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}