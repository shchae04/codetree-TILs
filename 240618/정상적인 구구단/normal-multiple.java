import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * " + j + " = " + (i * j));
                if (j < n) 
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}