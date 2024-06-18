import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentNumber = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // 홀수 줄 (0, 2, 4, ...)
                for (int j = 0; j < n; j++) {
                    System.out.print(currentNumber +" ");
                    if(j != n-1) currentNumber++;
                }
                currentNumber+=2;
            } else {
                // 짝수 줄 (1, 3, 5, ...)
                for (int j = 0; j < n; j++) {
                    System.out.print(currentNumber +" ");
                    if(j != n-1){
                        currentNumber+=2;
                    }
                    
                
                
                }
                        currentNumber+=1;
            }
            System.out.println();
        }
        sc.close();

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(i % 2 == 0)
        //             cnt++;
        //         else
        //             cnt += 2;
                
        //         System.out.print(cnt + " ");
        //     }
        //     System.out.println();
        // }
    }
}