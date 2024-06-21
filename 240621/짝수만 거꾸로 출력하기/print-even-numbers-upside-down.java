import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        int count = 0; 
        
        for (int i = 0; i < n; i++) { //n개
            int kk = sc.nextInt();

            if(kk % 2 ==0){
                arr[i] = kk;
                count++;
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.print(arr[count-1-i] + " ");
        }
    }
}