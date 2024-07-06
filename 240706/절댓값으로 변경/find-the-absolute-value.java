import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        calc(arr);
    }

    public static void calc(int[] arr){
        for(int i=0; i<arr.length; i++){

            if(arr[i] == 0) {
                System.out.print(arr[i] + " ");
            } else if(arr[i] < 0){
                System.out.print(Math.abs(arr[i]) + " ");
            } else {
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }
    }
}