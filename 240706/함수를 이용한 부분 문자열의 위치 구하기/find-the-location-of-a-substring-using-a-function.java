import java.util.Scanner;
public class Main {

    public static String text, pattern;

    public static boolean isSubStr(int startIdx){
        int n = text.length();
        int m = pattern.length();

        // startIdx + m -1 >= n 이면 text의 크기를 초과
        if(startIdx + m -1 >= n){
            return false;
        }

        for(int j=0; j<m; j++){
            if(text.charAt(startIdx + j) != pattern.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static int findIndex(){
        int n = text.length();
        for(int i=0; i<n; i++){
            if(isSubStr(i))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();  
        pattern = sc.nextLine();   

        System.out.println(findIndex());
    }

    // public static int calc(String str, String in){
    //     for(int i=0; i <= str.length() - in.length(); i++){  
    //         boolean flag = true;
    //         for(int j=0; j<in.length(); j++){  
    //             if(str.charAt(i+j) != in.charAt(j)){
    //                 flag = false;
    //                 break;
    //             }
    //         }

    //         if(flag){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}