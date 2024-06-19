import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(n-i + j +" ");
                
            }
            System.out.println();
        }

       
       //Rules  (n-i)  i+1  
       //i=0  4        
       //i=1  3 4  
       //i=2  2 3 4
       //i=3  1 2 3 4
    }
}