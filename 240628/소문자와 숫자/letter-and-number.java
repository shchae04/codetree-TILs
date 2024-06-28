import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (char character : inputString.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                result.append(Character.toLowerCase(character));
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}