import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int count = 0;

        // 세중 반복문으로 i, j, k 선택
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    // 조건 확인
                    if (A[i] <= A[j] && A[j] <= A[k]) {
                        count++;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(count);

        scanner.close();
    }
}
