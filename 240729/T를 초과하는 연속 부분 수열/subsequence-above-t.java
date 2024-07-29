import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int t = scanner.nextInt();
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxLength = 0;
        int currentLength = 0;
        
        //연속성 체크, arr[i] > t 로 변경
        for (int i = 0; i < N; i++) {
            if (arr[i] > t) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        
        System.out.println(maxLength);
    }
}