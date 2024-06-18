import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();

        int value = 1;
        for (int i = 1; i <= n; i++) { //1 2 3 4
            if (i % 2 == 1) { // 2 4
                for (int j = 1; j <= n; j++) {
                    System.out.print(value + " ");
                    value++;
                }
            } else { //1 2
                int startValue = value + n -1;
                for (int j=1; j<=n; j++) {
                    System.out.print(startValue + " ");
                    startValue--;
                    value++;
                }
            }
            System.out.println();
        }
    }
}

// i=0 1 2 3 4
// i=1 8 7 6 5
// i=2 9 10 11 12