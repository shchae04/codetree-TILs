import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 2;
        for(int i=b; i>=a-1; i--){
            for(int j=0; j<b-a+1; j++){ //3개 j<3 012
                System.out.print((b-j) + " * " + cnt + " = " + (b-j)*cnt +" ");
                if(b-j > 2){
                    System.out.print("/ ");
                }
                // 4-0 = 4-1 4-2

            }
            cnt+=2;
            System.out.println();
        }
    }
}