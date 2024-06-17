import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            if(i ==1 ){
                for(int j=1; j<=b; j++){
                    System.out.print(j + " ");
                }
            } else {
                for(int j=1; j<=b; j++){
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
    //1 1.2.3.4.5
    //2 4 6 8 10
}