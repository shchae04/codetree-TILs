import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String str1 = sc.next();
        if(str.length() > str1.length()){
            System.out.println(str +" "+ str.length());
        } else {
            System.out.println(str1 +" "+ str1.length());
        }
        
    

    }
}