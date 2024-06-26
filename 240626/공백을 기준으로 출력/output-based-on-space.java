import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String trimmedString = str.replaceAll("\\s+", "");
        String trimmedString2 = str2.replaceAll("\\s+", "");
        System.out.println(trimmedString + trimmedString2);

        // 문자열을 전부 순회하며 공백을 제외한 모든 문자를 출력합니다.
        // for(int i = 0; i < str.length(); i++)
        //     if(str.charAt(i) != ' ')
        //         System.out.print(str.charAt(i));
        
        // for(int i = 0; i < str2.length(); i++)
        //     if(str2.charAt(i) != ' ')
        //         System.out.print(str2.charAt(i));
    }
}