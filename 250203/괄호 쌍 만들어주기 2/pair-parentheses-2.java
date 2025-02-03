import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int n = A.length();

        //여는 쌍
        ArrayList<Integer> open = new ArrayList<>();

        //닫는 쌍
        ArrayList<Integer> close = new ArrayList<>();

        //loop
        for(int i = 0; i< n-1; i++){
            if(A.charAt(i) == '(' && A.charAt(i + 1) == '('){
                open.add(i);
            }
            if(A.charAt(i) == ')' && A.charAt(i + 1) == ')'){
                close.add(i);
            }
        }

        int count = 0;

        for(int oIdx : open){
            for(int cIdx : close){
                if(cIdx > oIdx){
                    count++;
                }
            }
        }

System.out.println(count);
    }
}