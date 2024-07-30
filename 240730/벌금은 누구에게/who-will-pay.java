import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt(); // 학생 수
        int M = scanner.nextInt(); // 벌칙 기록 수
        int K = scanner.nextInt(); // 벌금 기준 횟수
        
        int[] penalties = new int[N + 1]; 
        
        for (int i = 0; i < M; i++) {
            int studentNumber = scanner.nextInt();
            penalties[studentNumber]++;
            
            if (penalties[studentNumber] >= K) {
                System.out.println(studentNumber);
                return; // 프로그램 종료
            }
        }
        
        // M번의 기록이 모두 끝났는데도 벌금을 내는 학생이 없는 경우
        System.out.println(-1);
        
        scanner.close();
    }
}