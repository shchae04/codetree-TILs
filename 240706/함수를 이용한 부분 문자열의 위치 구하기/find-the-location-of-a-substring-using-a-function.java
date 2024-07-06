import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  
        String in = sc.nextLine();   

        int result = calc(str,in);
        System.out.println(result);
    }

    public static int calc(String str, String in){
        for(int i=0; i <= str.length() - in.length(); i++){  
            boolean flag = true;
            for(int j=0; j<in.length(); j++){  
                if(str.charAt(i+j) != in.charAt(j)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return i;
            }
        }
        return -1;
    }
}