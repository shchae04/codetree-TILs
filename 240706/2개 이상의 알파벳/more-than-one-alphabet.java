import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        
        String result = calc(str);
        System.out.println(result);
    }


    public static String calc(String str) {
    if (str == null || str.length() < 2) {
        return "No";
    }
    
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) != str.charAt(i + 1)) {
            return "Yes";
        }
    }
    
    return "No";
}
}