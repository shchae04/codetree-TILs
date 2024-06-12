import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int p;
        if(a > b && a > c){
            if(b>c){
                System.out.println(b);
            } else if(b<c){
                System.out.println(c);
            }
        } else {
            System.out.println(a);
        }
         
    }
}