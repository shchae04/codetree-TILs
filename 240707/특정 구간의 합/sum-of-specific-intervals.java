import java.util.Scanner;
public class Main {
    static int[] arr = new int[100];


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            calc(a1,a2);
        }

    }

    public static void calc(int a1, int a2){
        int sum = 0;
        for(int i=a1-1; i<=a2-1; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}