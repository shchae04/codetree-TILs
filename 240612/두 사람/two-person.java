import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        String gender1 = scanner.next();

        int age2 = scanner.nextInt();
        String gender2 = scanner.next();

        boolean condition1 = age1 >= 19 && gender1.equals("M");
        boolean condition2 = age2 >= 19 && gender2.equals("M");

        if (condition1 || condition2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}