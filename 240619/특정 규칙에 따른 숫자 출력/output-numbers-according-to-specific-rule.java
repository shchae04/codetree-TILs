import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =1;

        for (int i = 0; i < n; i++) {
            
            for (int k = 0; k < i; k++) {
                        System.out.print("  ");
                    }
            for (int j = 0; j < n-i; j++) {
                System.out.print(cnt +" ");
                cnt++;
                if(cnt > 9){
                    cnt = 1;
                }
            }
            System.out.println();
        }

       
    }
}