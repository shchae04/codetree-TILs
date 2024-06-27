import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // 예: codetree
        String move = sc.next(); // 예: LRLLLR

        for(int i = 0; i < move.length(); i++) {
            if(move.charAt(i) == 'L') { // L인 경우
                str = str.substring(1) + str.charAt(0);
            } else { // R인 경우
                str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);
    }
}