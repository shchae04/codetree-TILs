import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // 1 1 4 ::: 1 2 4
                if(j % 2 == 1){
                    System.out.print(i);
                } else {
                    System.out.print(n-i+1);
                }
            }
            System.out.println();
        }
    }
}