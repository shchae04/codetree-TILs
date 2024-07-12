import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String code = sc.next();
        String locale = sc.next();
        int time = sc.nextInt();
        CodeTree ct = new CodeTree(code, locale, time);

        System.out.println("secret code : " + ct.code);  
        System.out.println("meeting point : " + ct.locale);  
        System.out.println("time : " + ct.time); 
    }
}

class CodeTree {
    String code;
    String locale;
    int time;

    public CodeTree(String code, String locale, int time){
        this.code = code;
        this.locale =locale;
        this.time = time;
    }
};