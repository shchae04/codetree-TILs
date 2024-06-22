import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 원소 개수 n 및 n개의 원소
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 1부터 9까지 각 숫자의 등장 횟수를 저장할 배열
        int[] counts = new int[10];

        // 각 숫자의 등장 횟수를 계산
        for (int num : numbers) {
            counts[num]++;
        }

        // 결과 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(counts[i]);
        }

        sc.close();
    }
}