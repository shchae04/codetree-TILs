import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

        int[] arr = new int[5];
        boolean flag = true;
        for(int tt : arr){
            if(tt % 3 != 0){
                flag = false;
            }
        }

        if(flag){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
	}

}