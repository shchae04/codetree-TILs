import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        int length = binaryString.length();
        int[] binary = new int[length];
        
        // 입력받은 2진수 문자열을 배열에 저장
        for (int i = 0; i < length; i++) {
            binary[i] = binaryString.charAt(i) - '0';
        }
        
        int num = 0;
        // 2진수를 10진수로 변환
        for (int i = 0; i < length; i++) {
            num = num * 2 + binary[i];
        }
        
        // 결과 출력
        System.out.print(num);
    }
}