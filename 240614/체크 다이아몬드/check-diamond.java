import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int size = 2 * n - 1;
        char[][] diamond = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                diamond[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                diamond[i][n - 1 - i + 2 * j] = '*';
                diamond[size - 1 - i][n - 1 - i + 2 * j] = '*';
            }
        }

        for (char[] row : diamond) {
            System.out.println(new String(row));
        }
    }
}