import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String trimmedString = str.replaceAll("\\s+", "");
        String trimmedString2 = str2.replaceAll("\\s+", "");
        System.out.println(trimmedString + trimmedString2);
    }
}