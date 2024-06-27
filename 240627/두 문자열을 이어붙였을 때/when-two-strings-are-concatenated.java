import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(); 
        String str2 = sc.next();

        String temp1= str1 + str2;
        String temp2 =str2 + str1;

        if(temp1.equals(temp2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}