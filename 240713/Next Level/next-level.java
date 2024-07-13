import java.util.Scanner;

class User {
    String id, lv;

    public User(){
        this.id = "";
        this.lv = "";
        
    }

    public User(String id, String lv){
        this.id = id;
        this.lv = lv;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        User user = new User("codetree", "10");
        System.out.print("user " +user.id + " ");  
        System.out.println("lv " + user.lv);  

        String inputId = sc.next();
        String inputLv = sc.next();

        user.id = inputId;
        user.lv = inputLv;
        System.out.print("user " +user.id + " ");  
        System.out.println("lv " + user.lv);  
    }
}