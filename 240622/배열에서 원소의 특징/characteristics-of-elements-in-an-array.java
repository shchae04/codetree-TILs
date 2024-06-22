import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] % 3 == 0){
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}