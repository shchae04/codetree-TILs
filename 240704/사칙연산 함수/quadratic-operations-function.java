import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String str = sc.next();

        int b = sc.nextInt();

        System.out.println(calc(a,str,b));
    }

    public static String calc(int a, String str, int b){

        if(str.equals("+")){
            return a + " + " + b + " = " +(a+b);
        }
        else if(str.equals("*")){
            return a + " * " + b + " = " +(a*b);
        }
        else if(str.equals("/")){
            return a + " / " + b + " = " +(a/b);
        }
        else if(str.equals("-")){
            return a + " - " + b + " = " +(a-b);
        } else {
            return "False";
        }
    }
}