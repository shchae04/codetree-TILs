import java.util.Scanner;

public class Main {
    public static int findMax(int[] arr, int n) {

// f() 함수가 반환하는 값이 무엇인지 정의를 먼저합니다.
// f()함수 안에서 해당 정의를 만족하기위해 어떻게 f()를 불러야하는지 작성합니다.
// 그 후에 종료조건을 적어줍니다

//f(n) : 1~n까지 원소중 최대값을 반환하는 함수
// f(n) = max(a[1], a[2], ..., a[n]) = max(f(n-1), a[n])
// 종료조건: f(1) => a[1]

        //원소가 한개
        if (n == 1) {
            return arr[0];
        }
        
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
        
        System.out.println(findMax(arr, n));
        
        scanner.close();
    }
}