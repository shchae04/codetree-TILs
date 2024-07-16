import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int diff = (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60  + 11);

        if(diff <0){
            System.out.print(-1);
        } else {
            System.out.print(diff);
        }
        
    }
}