import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {//0 1 2
            for (int j = 0; j < i + 1; j++) {
                System.out.print((j+1)* (i + 1) +" ");
            }
            System.out.println();
        }
    }
}