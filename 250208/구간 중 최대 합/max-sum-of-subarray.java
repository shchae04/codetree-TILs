import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n, k;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = 0;
        for(int i=0; i<= n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}