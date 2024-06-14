import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();

        if(1920  % a == 0 || 2880 % b == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }



        
	
	}

}