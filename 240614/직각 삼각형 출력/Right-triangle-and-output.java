import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner scanner = new Scanner(System.in);
		
		 // 정수 n 입력 받기
        int n = scanner.nextInt();

        // 삼각형 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
	
	}

}