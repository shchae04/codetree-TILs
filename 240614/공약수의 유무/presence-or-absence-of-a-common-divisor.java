import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 범위 확인
        if (a < 1 || a > b || b > 1000) {
            System.out.println("입력 범위 오류 (1 ≤ a ≤ b ≤ 1,000)");
            return;
        }

        // 1,920과 2,880의 최대 공약수 계산
        int gcd1920_2880 = Math.max(1, Math.min(a, b) / 240);

        // 공약수 존재 여부 판단
        boolean exists = false;
        for (int num = a; num <= b; num++) {
            if (num % gcd1920_2880 == 0) {
                exists = true;
                break;
            }
        }

        // 출력
        System.out.println(exists ? 1 : 0);
    }
}