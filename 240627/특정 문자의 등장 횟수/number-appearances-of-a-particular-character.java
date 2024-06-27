import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); //ebcdee

        
        int cntE = 0;
        int cntB = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e' && i + 1 < str.length()){
                if(str.charAt(i+1) == 'e'){
                    cntE++;
                }
                if(str.charAt(i+1) == 'b'){
                    cntB++;
                }
            }
        }

        System.out.print(cntE+ " " + cntB);
    }
}