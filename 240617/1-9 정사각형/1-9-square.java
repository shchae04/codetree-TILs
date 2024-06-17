import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();

        int temp = 1;
        // 각 칸의 정사각형에 알맞은 값을 출력합니다.
        for(int i = 0; i < n; i++) { // 1 2 3 4
            for(int j = 0; j < n; j++) { // 1 2 3 4
                System.out.print(temp);

                if (temp == 9) {
                    temp = 1;
                } else {
                    temp++;
                }
            }
            System.out.println();

        }
    }
}