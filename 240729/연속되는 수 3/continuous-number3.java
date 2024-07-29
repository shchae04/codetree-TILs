import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에 N을 입력 받습니다.
        int N = scanner.nextInt();
        
        // 수열을 입력받을 배열을 생성합니다.
        int[] sequence = new int[N];
        
        // N개의 숫자를 입력받습니다.
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }
        
        // 최대 길이와 현재 길이를 추적하기 위한 변수 초기화
        int maxLength = 1;
        int currentLength = 1;
        
        // 수열을 순회하면서 부호가 동일한 연속 부분 수열의 최대 길이를 찾습니다.
        for (int i = 1; i < N; i++) {
            if ((sequence[i] > 0 && sequence[i - 1] > 0) || (sequence[i] < 0 && sequence[i - 1] < 0)) {
                // 현재 숫자가 이전 숫자와 부호가 같다면 현재 길이를 증가시킵니다.
                currentLength++;
            } else {
                // 부호가 다르면 현재까지의 길이를 최대 길이와 비교하여 갱신합니다.
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                // 현재 길이를 1로 초기화합니다.
                currentLength = 1;
            }
        }
        
        // 마지막 부분 수열의 길이도 최대 길이와 비교하여 갱신합니다.
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        
        // 결과를 출력합니다.
        System.out.println(maxLength);
        
        scanner.close();
    }
}