import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 1920과 2880의 공약수 구하기
        int gcd = gcd(1920, 2880);
        
        // 범위 [a, b]에 공약수가 있는지 확인
        boolean exists = false;
        for (int i = a; i <= b; i++) {
            if (gcd % i == 0) {
                exists = true;
                break;
            }
        }

        // 결과 출력
        System.out.println(exists ? 1 : 0);
        
        scanner.close();
    }

    // 최대 공약수를 구하는 함수 (유클리드 호제법 사용)
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}