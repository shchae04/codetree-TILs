import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = (new Scanner(System.in)).nextInt();

        for(int i=0; i<n; i++){
            if(i % 2==0){
                for(int j=0; j<n; j++){
                    System.out.print(j+1);
                }
            } else {
                for(int j=n; j>=1; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    // for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < n; j++) {
    //             if(i % 2 == 0) {
    //                 System.out.print(j + 1);
    //             }
    //             else {
    //                 System.out.print(n - j);
    //             }
    //         }
    //         System.out.println();
    //     }
}