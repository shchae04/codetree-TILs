import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int n1 = Integer.parseInt(s1+s2);
        int n2 = Integer.parseInt(s2+s1);

        System.out.println(n1 + n2);
    }
}