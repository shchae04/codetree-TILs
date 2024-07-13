import java.util.Scanner;

// User 정보를 나타내는 클래스 선언
class Bomb {
    String code;
    String color;
    int sec;

    public Bomb(String code, String color, int sec){
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
};

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String code =sc.next();
        String color = sc.next();
        int sec = sc.nextInt();

        Bomb bomb = new Bomb(code,color,sec);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.sec);
    }
}