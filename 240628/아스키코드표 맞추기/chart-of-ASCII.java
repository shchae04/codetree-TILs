import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<5; i++)
        arr[i] = sc.nextInt();
        
        for(int i=0; i<5; i++)
        System.out.print((char)arr[i]+" ");

        
    }
}