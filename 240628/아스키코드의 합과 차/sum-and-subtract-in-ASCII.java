import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ch1 = (int)(sc.next().charAt(0));
        int ch2 = (int)(sc.next().charAt(0));

        int sum=0;
        int minus = 0;
        if(ch1 > ch2){
            minus = ch1-ch2;
        } else {
            minus = ch2 -ch1;
        }

        System.out.println( ch1 + ch2+ " " + minus);

        
    }
}