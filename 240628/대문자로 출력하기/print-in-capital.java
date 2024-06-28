import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 'a' + 'A');
                }
                output += ch;
            }
        }

        System.out.println(output);
    }
}