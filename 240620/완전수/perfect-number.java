import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt(); // start
        int end = sc.nextInt(); //end
        int cnt = 0; //완전수의 갯수

        for (int i = start; i <= end; i++) { // start 부터 end까지
            int sum = 0;
            int k = 1;
            while (k != i) {//start 가 아닐때까지만
                if (i % k == 0) { 
                    sum += k;
                } 
                k++;
            }
            if(sum == i){
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close(); 
    }
}