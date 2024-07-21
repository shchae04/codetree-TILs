import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();

        if (n == 0) {
            digits.add(0);
        } else {
            while (n > 0) {
                digits.add(n % 2);
                n /= 2;
            }
        }
        
        // print binary number
        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i));
        }
    }
}