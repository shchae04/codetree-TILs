import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        for(int i = 0; i < 2 * n; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);

        int gMax = 0;
        for(int i=0; i<n; i++){
            //정렬 후
            //맨 앞 + 맨 뒤
            int gSum = nums[i] + nums[2*n -1 -i];
            if(gSum > gMax){
                gMax = gSum;
            }

        }

        System.out.println(gMax);
    }
}