import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(checkNumber(n));
        
        scanner.close();
    }
    
    public static String checkNumber(int n) {
        if (isEven(n) && isSumMultipleOfFive(n)) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    public static boolean isSumMultipleOfFive(int n) {
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }

        return sum % 5 == 0;
    }
}