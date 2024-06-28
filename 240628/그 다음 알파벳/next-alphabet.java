import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = (int)sc.next().charAt(0); //숫자로 변환


        if(a == (int)'z'){
            System.out.println('a');
        } else {
System.out.println((char)(a + 1));
        }
        
        
    }
}