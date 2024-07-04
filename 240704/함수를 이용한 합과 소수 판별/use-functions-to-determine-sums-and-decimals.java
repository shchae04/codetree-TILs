import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc(a,b));
    }

  // 계산
public static int calc(int a, int b) {
    int cnt = 0;
    for (int i = a; i <= b; i++) {
        if (isPrime(i) && isEven(i)) {
            cnt++;
        }
    }
    return cnt;
}

// 소수인지 판단
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}

// 자릿수의 합이 짝수인지 판단
public static boolean isEven(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum % 2 == 0;
}
}