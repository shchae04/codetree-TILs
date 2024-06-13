import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();

        int count = 1; 
        int divisor = 1;

        while (n > 1) {
            divisor++;
            n /= divisor;
            count++;
        }

        System.out.println(count);
    }
}