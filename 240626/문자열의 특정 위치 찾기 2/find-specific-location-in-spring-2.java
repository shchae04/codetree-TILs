import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 문자열 배열 초기화
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 하나의 영문자 입력받기
        char targetChar = sc.next().charAt(0);

        // 일치하는 문자열 개수를 세기 위한 변수
        int count = 0;

        // 배열의 각 문자열을 검사하여 조건을 만족하는 문자열 찾기
        for (String str : arr) {
            // 문자열의 길이가 4보다 작으면 continue (세 번째나 네 번째 문자가 없는 경우)
            if (str.length() < 4) {
                continue;
            }
            
            // 세 번째나 네 번째 문자와 일치하는지 검사
            char thirdChar = str.charAt(2); // 세 번째 문자
            char fourthChar = str.charAt(3); // 네 번째 문자
            
            if (thirdChar == targetChar || fourthChar == targetChar) {
                System.out.println(str);
                count++;
            }
        }

        // 조건을 만족하는 문자열의 개수 출력
        System.out.println(count);
        
        // Scanner 닫기
        sc.close();
    }
}