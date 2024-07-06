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

// 문자열에 알파벳이 2개 이상인지 여부를 반환합니다.
    public static boolean isMoreTwoalp(String str) {
        // 하나라도 서로 다른 알파벳이 있다면
        // 그 문자열은 알파벳이 2개 이상입니다.
        int len = str.length();
        for(int i = 0; i < len; i++)
            if(str.charAt(i) != str.charAt(0))
                return true;
    
        return false;
    }
}