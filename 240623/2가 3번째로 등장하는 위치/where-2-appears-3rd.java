import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //2의 개수를 기억하는 cnt
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 문자 탐색
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            
            if(a == 2) {
                cnt++;
            }

            if(cnt == 3){
                System.out.println(i + 1);
                break;
            }
        }


    }
}