import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 각 행에 대해 반복하여 출력
        for (int i = 1; i <= 9; i++) { // 1 ~ 9
            for (int j = b; j >= a; j=j-2) { //6, 4, 2
                System.out.print(j + " * " + i + " = " + (j * i));
                // 맨 마지막 곱셈 결과에는 / 출력하지 않음
                if (j > a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }

        sc.close();
    }

    //고정인 수를 바깥 for문
    //움직이는 수를 안쪽 for문
}