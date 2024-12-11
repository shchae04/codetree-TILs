import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 효율적으로 읽어들임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine().trim();
        int count = 0;
        int n = A.length();
        
        // 각 위치에서 '('를 찾고, 그 이후의 ')' 개수를 센다
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == '(') {
                for(int j = i + 1; j < n; j++) {
                    if(A.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}
