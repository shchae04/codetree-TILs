import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        int countC = 0;
        int countCO = 0;
        int countCOW = 0;

        for(int i =0; i<N; i++){
            char ch = s.charAt(i);
            if(ch == 'C'){
                countC++;
            } else if(ch == 'O'){
                countCO += countC;
            } else if(ch == 'W'){
                countCOW += countCO;
            }
        }

        System.out.println(countCOW);
    }
}