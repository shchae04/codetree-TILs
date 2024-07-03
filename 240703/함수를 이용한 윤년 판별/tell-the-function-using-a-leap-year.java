import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean result = isLeapYear(n);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year){
        if(year %  4 == 0){
            if(year % 100 == 0 && year % 400 != 0){
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}