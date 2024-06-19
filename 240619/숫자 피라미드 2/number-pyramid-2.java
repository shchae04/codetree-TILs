import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =1;
        for (int i = 0; i < n; i++) {//0 1 2 3
            for (int j = 0; j < i + 1; j++) {
                System.out.print(cnt +" ");   // i 출력 1
                cnt++;
            }
            System.out.println();
        }
    }
}