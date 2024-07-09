import java.util.Scanner;

public class Main {
    public static int findMax(int[] arr, int n) {
        // 기저 조건: 배열에 원소가 하나만 남았을 때
        if (n == 1) {
            return arr[0];
        }
        
        // 나머지 원소들 중 최댓값을 재귀적으로 찾음
        int maxOfRest = findMax(arr, n - 1);
        
        // 현재 원소와 나머지 원소들의 최댓값을 비교
        return Math.max(arr[n - 1], maxOfRest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 최댓값 찾기 및 출력
        int result = findMax(arr, n);
        System.out.println(result);
        
        scanner.close();
    }
}