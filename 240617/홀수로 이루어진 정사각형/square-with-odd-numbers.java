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
        //i=11 j=11 13 15 17 19
        //i=13 j=13 15 17 19 21
        //i=15 j=15 17 19 21 23
        //i=17 
        //i=19
    }
}