import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { //0 1 2 3
            //공백의 갯수 숫자의 갯수 i번 만큼 공백 출력
            for (int k = 0; k < i; k++) {
                        System.out.print("  ");
                    }
            for (int j = 0; j < n-i; j++) { // 4 3 2 1 출력
                System.out.print(n-i-j +" ");   // i 출력 1
            }
            System.out.println();
        }
    }
}