import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();

        for(int i=11; i<11 +2*n-1; i=i+2){
            for(int j=0; j<2*n; j=j+2){
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        // n칸의 정사각형에 올바른 숫자를 출력합니다.
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         System.out.print((i * 2 + j * 2 + 11) + " ");
        //     }
        //     System.out.println();
        // }
    }
}