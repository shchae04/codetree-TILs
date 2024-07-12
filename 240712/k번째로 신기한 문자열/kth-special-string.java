import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();

        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            String word = sc.next();
            if(word.startsWith(T)){
                list.add(word);
            }
        }


        Collections.sort(list);

        System.out.println(list.get(k-1));


    }
}