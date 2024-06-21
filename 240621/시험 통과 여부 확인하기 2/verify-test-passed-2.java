import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[][] arr = new int[n][4];
        int count = 0; 
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            double average = sum / 4.0;
            if (average >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}