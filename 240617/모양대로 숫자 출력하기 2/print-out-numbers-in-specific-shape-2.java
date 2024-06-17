import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();

        int temp = 2;
        // 각 칸의 정사각형에 알맞은 값을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(temp + " ");

                if (temp == 8) {
                    temp = 2;
                } else {
                    temp = temp + 2;
                }
            }
            System.out.println();
        }
    }
}