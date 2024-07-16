import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        LocalDateTime start = LocalDateTime.of(2011, 11, 11, 11, 11);
        LocalDateTime end = LocalDateTime.of(2011, 11, a, b, c);
        
        if (end.isBefore(start)) {
            System.out.println(-1);
        } else {
            Duration duration = Duration.between(start, end);
            long minutes = duration.toMinutes();
            System.out.println(minutes);
        }
        
        scanner.close();
    }
}