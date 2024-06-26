import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 문자열 입력 받기

        StringBuilder result = new StringBuilder();

        // 짝수 번째 문자만 추출하여 역순으로 result에 저장
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) { // 짝수 번째 인덱스인 경우만 처리
                result.insert(0, input.charAt(i));
            }
        }

        System.out.println(result.toString()); // 출력
    }
}