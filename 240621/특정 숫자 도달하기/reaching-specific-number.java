import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int sum = 0;
        int count = 0;
        boolean found250OrAbove = false;
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] >= 250) {
                found250OrAbove = true;
                break;
            }
            sum += numbers[i];
            count++;
        }
        
        if (found250OrAbove) {
            for (int i = count + 1; i < 10; i++) {
                sc.nextInt();
            }
        } else {
            for (int i = count; i < 10; i++) {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }
            count = 10;
        }
        
        double average = (double) sum / count;
        System.out.printf("%d %.1f", sum, average);
        
        sc.close();
    }
}