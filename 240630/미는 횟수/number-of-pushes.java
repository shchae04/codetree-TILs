import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int length = A.length();

        for (int n = 1; n <= length; n++) {
            A = A.charAt(length - 1) + A.substring(0, length - 1);

            if (A.equals(B)) {
                System.out.println(n);
                return;
            }
        }

        System.out.println(-1);
    }
}