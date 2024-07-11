import java.util.Scanner;
import java.util.Arrays;

public class Main {    
    public static final int MAX_N = 1000;
    
    // 변수 선언
    public static int n, k;
    
    public static int[] nums = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        k = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // nums[0]부터 nums[n - 1]까지를 정렬함
        Arrays.sort(nums, 0, n);

        // k번째 원소를 출력 (원소 k-1)
        System.out.print(nums[k - 1]);

    }
}