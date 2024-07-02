import java.util.Scanner;

public class Main {
    public static void printRectangle(int n) {
        int cnt = 1;
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++){
                System.out.print(cnt++ + " ");
                if(cnt == 10) cnt = 1;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRectangle(n);
    }
}