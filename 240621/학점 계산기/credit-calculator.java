import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

        double[] arr = new double[100];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = (double)(sum/n);
        System.out.printf("%.1f\n",avg);
        
        if(avg>4.0){
            System.out.println("Perfect");
        } else if(avg>3.0){
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}