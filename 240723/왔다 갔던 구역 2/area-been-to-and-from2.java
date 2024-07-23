import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 겹치는 부분 배열 선언
        int[] arr = new int[201];  // -100부터 100까지의 범위를 커버
        int pos = 100;  // 시작 위치 (0에 해당)

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String direction = sc.next();
            
            if (direction.equals("L")) {
                // 왼쪽으로 이동
                for (int j = 0; j < x; j++) {
                    pos--;
                    arr[pos]++;
                }
            } else {
                // 오른쪽으로 이동
                for (int j = 0; j < x; j++) {
                    arr[pos]++;
                    pos++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 201; i++) {
            if (arr[i] >= 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}