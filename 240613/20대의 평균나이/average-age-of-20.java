import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 여기에 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList();
        while(sc.hasNextInt()){
            int age = sc.nextInt();
            if(age < 20 || age >= 30){
                break;
            }
            list.add(age);
        }

        double sum = 0;
        for(int age: list){
            sum += age;
        }

        double aver = sum / list.size();
        System.out.printf("%.2f\n",aver);
	
	}

}