import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.contains("ee")){
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }


        if(str.contains("ab")){
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
    }
}