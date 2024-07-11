import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] numbers = new Integer[2*N];
        
        for (int i = 0; i < 2*N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 내림차순 정렬
        Arrays.sort(numbers, Collections.reverseOrder());
        
        int maxSum = numbers[0] + numbers[2*N-1];
        
        for (int i = 0; i < N; i++) {
            int sum = numbers[i] + numbers[2*N-1-i];
            maxSum = Math.max(maxSum, sum);
        }
        
        System.out.println(maxSum);
    }
}