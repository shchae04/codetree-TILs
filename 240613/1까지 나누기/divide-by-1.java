import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

        int cnt = 0;
        int divisor =1;

        while(true){
            
            n = n/divisor;
            ++divisor;
            ++cnt;
            if(n == 0) {break;}
        }

        System.out.println(cnt);
			
	}

}