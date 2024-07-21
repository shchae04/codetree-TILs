import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        
        // 이진수를 10진수로 변환
        int decimalValue = Integer.parseInt(binaryString, 2);
        
        // 17배하기
        int multipliedValue = decimalValue * 17;
        
        // 10진수를 다시 이진수로 변환
        String resultBinaryString = Integer.toBinaryString(multipliedValue);
        
        // 결과 출력
        System.out.println(resultBinaryString);
    }
}