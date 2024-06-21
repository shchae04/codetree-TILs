import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[8];
        
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        
        System.out.printf("%.1f", (double)(sum/8));
        
        sc.close(); // 스캐너를 닫아줍니다.
    }
}