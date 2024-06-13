import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        int i = 1;
        while(true){
            a +=b;
            System.out.println(a);


            if(i == b){
                break;
            }
            i++;
        }
    }
}