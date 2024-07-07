import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        printAscending(N, 1);
        System.out.println(); // 줄 바꿈
        printDescending(N, N);
        
        scanner.close();
    }
    
    // 1부터 N까지 오름차순으로 출력하는 재귀 함수
    public static void printAscending(int N, int current) {
        if (current > N) {
            return;
        }
        System.out.print(current + " ");
        printAscending(N, current + 1);
    }
    
    // N부터 1까지 내림차순으로 출력하는 재귀 함수
    public static void printDescending(int N, int current) {
        if (current < 1) {
            return;
        }
        System.out.print(current + " ");
        printDescending(N, current - 1);
    }
}