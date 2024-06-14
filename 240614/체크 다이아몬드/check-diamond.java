import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int size = 2 * n - 1;
        

        for(int i=0; i<n; i++){ //첫줄
            for(int j=0; j< n - i - 1; j++){ //공백 삽입 
                System.out.print(" "); //2번  
                //0 -> 2
                //1 -> 1
                //2 -> 0                                 
            } 
            for(int j=0; j< i + 1; j++){
                System.out.print("* ");
                //0 -> 1번
                //1 -> 2번
                //3 -> 3번
            }
            //  *
            // * *
            //* * *
                        System.out.println();

        }

        for(int i = n-2; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }












        

        // 모양에 맞게 위쪽 별을 출력합니다.
        // for(int i = 0; i < n; i++) { // i=0; i=1
        //     for(int j = 0; j < n - i - 1; j++) //j=0,1 1
        //         System.out.print(" ");
        //     for(int j = 0; j < i + 1; j++) //*하나 찍음
        //         System.out.print("* ");
        //     System.out.println(); //개행 
        // }

        // 모양에 맞게 아래쪽 별을 출력합니다.
        // for(int i = n-2; i >= 0; i--) {
        //     for(int j = 0; j < n - i - 1; j++)
        //         System.out.print(" ");
        //     for(int j = 0; j < i + 1; j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
    }
}