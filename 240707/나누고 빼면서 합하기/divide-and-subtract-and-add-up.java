import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        // 결과 계산 및 출력
        int result = calculateSum(A, m);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int calculateSum(int[] A, int m) {
        int sum = 0;
        
        while (m > 0) {
            sum += A[m - 1];  // 배열의 인덱스는 0부터 시작하므로 m-1
            
            if (m == 1) {
                break;
            } else if (m % 2 == 0) {
                m /= 2;
            } else {
                m--;
            }
        }
        
        return sum;
    }
}