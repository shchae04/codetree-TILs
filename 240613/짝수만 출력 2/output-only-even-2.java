import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        
        // 현재 숫자를 b로 설정
        int current = b;
        
        // 짝수를 내림차순으로 출력
        while (current >= a) {
            // current가 짝수인 경우 출력
            if (current % 2 == 0) {
                System.out.print(current + " ");
            }
            // current를 2씩 감소
            current -= 2;
        }
        
        // Scanner 닫기
        scanner.close();
    }
}