import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt(); // start
        int end = sc.nextInt(); //end
        
        int sum = 0;

        for (int i = start; i <= end; i++) { // start 부터 end까지

            int k = 1; // 1 ~ 
            int cnt = 0; // 약수의 갯수 
            while (k < i) {//start 가 아닐때까지만
                if (i % k == 0) { 
                    cnt++;
                } 
                k++;
            }
            if(cnt == 3){
                sum++;
            }
        }

        System.out.println(sum);
        sc.close(); 
    }
}