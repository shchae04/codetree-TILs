import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
    
        List<Integer> list = new ArrayList();
        for(int i=1; i<=a; i++){
            boolean one = (i % 2==0) && (i % 4!=0);
            boolean two = (i / 8) % 2 == 0;
            boolean three  = (i%7 )<4;

            if(!one && !two && !three){
                list.add(i);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
	}

}