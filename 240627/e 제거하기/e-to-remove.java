import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int index = input.indexOf('e');

        String result = input.substring(0, index) + input.substring(index + 1);

        System.out.println(result);
    }
}