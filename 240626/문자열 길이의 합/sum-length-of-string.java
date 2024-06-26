import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 n 입력
        int n = sc.nextInt();
        
        // 개행 문자 처리
        sc.nextLine();
        
        // 문자열 배열 초기화
        String[] arr = new String[n];
        
        // 문자열 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        // 모든 문자열 길이의 합과 'a'의 개수 계산
        int sum = 0;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i].length(); // 각 문자열의 길이를 합산
            
            // 첫 번째 문자가 'a'인지 검사
            if (arr[i].charAt(0) == 'a') {
                cnt++;
            }
        }
        
        // 결과 출력
        System.out.println(sum + " " + cnt);
        
        // Scanner 닫기
        sc.close();
    }
}