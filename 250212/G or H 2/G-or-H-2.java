import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 100;
    
    public static int n, k;
    public static int[] arr = new int[MAX_NUM + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            

            // G와 H의 위치를 1,2로 표현
            if(c == 'G')
                arr[x] = 1;
            else
                arr[x] = 2;
        }
        
        // 모든 구간의 시작점을 잡아봅니다.
        int maxLen = 0;
        for(int i = 0; i <= MAX_NUM; i++) {
            for(int j = i + 1; j <= MAX_NUM; j++) {
                // i와 j 위치에 사람이 있는지 확인합니다.
                if(arr[i] == 0 || arr[j] == 0)
                    continue;
                
                // 해당 구간 내 g와 h의 개수를 구합니다.
                int cntG = 0;
                int cntH = 0;
                
                for(int k = i; k <= j; k++) {
                    if(arr[k] == 1)
                        cntG++;
                    if(arr[k] == 2)
                        cntH++;
                }
                
                // 조건을 만족할 때 구간의 길이를 구해 최댓값과 비교합니다.
                if(cntG == 0 || cntH == 0 || cntG == cntH) {
                    int len = j - i;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
                            
        System.out.print(maxLen);
    }
}
