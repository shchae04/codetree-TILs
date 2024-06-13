import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 첫 번째 줄에서 N을 입력받음
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        
        // 결과를 저장할 배열
        int[] numbers = new int[N];
        
        // 두 번째 줄부터 N개의 정수를 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 홀수이면서 3의 배수인 수를 출력
        for (int number : numbers) {
            if (number % 2 != 0 && number % 3 == 0) {
                System.out.println(number);
            }
        }
        
        sc.close();

    }
}