import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력받을 숫자의 개수

        for (int i = 0; i < n; i++) { // 입력받은 개수만큼 반복
            int a = sc.nextInt(); // 각 숫자 입력받기
            int steps = 0;
            
            while (a != 1) { // a가 1이 될 때까지 반복
                if (a % 2 == 0) { // 짝수인 경우
                    a /= 2;
                } else { // 홀수인 경우
                    a = a * 3 + 1;
                }
                steps++;
            }
            System.out.println(steps); // 각 숫자가 1이 될 때까지 걸린 횟수 출력
        }
        sc.close(); 
    }
}