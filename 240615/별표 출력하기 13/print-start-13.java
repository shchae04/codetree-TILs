import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 상반부
        for (int i = 0; i < n; i++) {
            int stars;
            if (i == 0) {
                stars = n;
            } else if (i % 2 == 1) {
                stars = (i + 1) / 2;
            } else {
                stars = n - (i / 2);
            }
            printStars(stars);
        }

        // 하반부
        for (int i = n - 1; i >= 0; i--) {
            int stars;
            if (i == 0) {
                stars = n;
            } else if (i % 2 == 1) {
                stars = (i + 1) / 2;
            } else {
                stars = n - (i / 2);
            }
            printStars(stars);
        }

        sc.close();
    }

    private static void printStars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}