import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        printAsc(arr);
        printDesc(arr);
    }

    //ASC 출력
    public static void printAsc(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //DESC 출력
    public static void printDesc(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[arr.length -1 - i]+" ");
        }
        System.out.println();
    }
}