import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        
        sc.close();
    }
}