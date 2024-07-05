import java.util.Scanner;

public class Main {
    // 두 정수를 교환하는 함수
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 배열에 두 정수 저장
        int[] numbers = {n, m};
        
        // swap 함수 호출
        swap(numbers);
        
        // 교환된 결과 출력
        System.out.println(numbers[0] + " " + numbers[1]);
        
        scanner.close();
    }
}