import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hap = a + b;

        String hapStr = Integer.toString(hap);

        int cnt =0;
        for(int i=0; i<hapStr.length(); i++){
            if(hapStr.charAt(i) == '1'){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}