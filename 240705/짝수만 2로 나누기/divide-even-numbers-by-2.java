import java.util.Scanner;
public class Main {

    public static void modify(int[] arr2) {  // arr2는 arr와 관련이 없다.
        arr2[0] = 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        modify(arr.clone());           

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 ==0){
                arr[i] = arr[i] / 2;
            } 
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}