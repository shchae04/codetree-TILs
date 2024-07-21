import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        
        // a진수 n을 10진수로 변환
        int decimalValue = Integer.parseInt(n, a);
        
        // 10진수 값을 b진수로 변환
        String result = Integer.toString(decimalValue, b);
        
        // 결과 출력
        System.out.println(result);
    }
}