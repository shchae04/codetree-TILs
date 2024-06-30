import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        
        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")) {
                break;
            }
            strings.add(str);
        }

        System.out.println(strings.size());

        for (int i = 0; i < strings.size(); i++) {
            if (i % 2 == 0) {  
                System.out.println(strings.get(i));
            }
        }

      
    }
}