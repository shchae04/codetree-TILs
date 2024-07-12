import java.util.Scanner;

public class Main {
    public static final int ASCII_NUM = 128;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[] count = new int[ASCII_NUM];

        // count 배열을 0으로 초기화 해줍니다.
        for(int i = 0; i < ASCII_NUM; i++)
            count[i] = 0;

        // 첫 번째 문자열을 순회하며 각 문자의 개수를 세줍니다. 
        for(int i = 0; i < str1.length(); i++)
            count[str1.charAt(i)]++;

        // 두 번째 문자열을 순회하며 각 문자의 개수를 세줍니다. 
        for(int i = 0; i < str2.length(); i++)
            count[str2.charAt(i)]--;

        // count 배열을 순회하면서 모든 문자의 개수가 동일한지를 확인합니다.
        for(int i = 0; i < ASCII_NUM; i++)
            if(count[i] != 0) {
                System.out.print("No");
                System.exit(0);
            }

        System.out.print("Yes");
    }
}