import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 문자열의 개수

        String[] arr = new String[n];

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            temp.append(arr[i]);
        }

        // 결과를 저장한 temp 문자열을 5개씩 나누어 출력
        int length = temp.length();
        for (int i = 0; i < length; i++) {
            if (i > 0 && i % 5 == 0) {
                System.out.println();
            }
            System.out.print(temp.charAt(i));
        }
        // 마지막 줄이 개행되지 않았으면 개행
        if (length % 5 != 0) {
            System.out.println();
        }
    }
}