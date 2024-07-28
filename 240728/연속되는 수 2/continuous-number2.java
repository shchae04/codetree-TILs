import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int prevNum = -1;  // 이전 숫자 (초기값은 입력 범위 밖의 값)
        int currentCount = 0;  // 현재 연속 횟수
        int maxCount = 0;  // 최대 연속 횟수
        
        for (int i = 0; i < N; i++) {
            int currentNum = sc.nextInt();
            
            if (currentNum == prevNum) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            
            maxCount = Math.max(maxCount, currentCount);
            prevNum = currentNum;
        }
        
        System.out.println(maxCount);
        sc.close();
    }
}