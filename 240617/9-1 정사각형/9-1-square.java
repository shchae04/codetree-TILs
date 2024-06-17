import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();

        int temp = 9;
        // 각 칸의 정사각형에 알맞은 값을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(temp);

                if (temp == 1) {
                    temp = 9;
                } else {
                    temp--;
                }
            }
            System.out.println();
        }
    }
}