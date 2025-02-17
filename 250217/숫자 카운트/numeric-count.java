import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Guess> guesses = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String guessNum = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            guesses.add(new Guess(guessNum, strike, ball));
        }
        
        int count = 0;
        // 123부터 987까지 순회 (세 자리 수)
        for (int num = 123; num <= 987; num++) {
            String candidate = Integer.toString(num);
            // 0이 포함되어 있거나, 중복된 숫자가 있다면 건너뜁니다.
            if (!isValidCandidate(candidate)) continue;
            
            boolean possible = true;
            for (Guess g : guesses) {
                int[] result = getCounts(candidate, g.number);
                if (result[0] != g.strike || result[1] != g.ball) {
                    possible = false;
                    break;
                }
            }
            if (possible) count++;
        }
        
        System.out.println(count);
    }
    
    // 후보가 1~9의 서로 다른 숫자 3개로 이루어졌는지 체크
    static boolean isValidCandidate(String s) {
        if (s.length() != 3) return false;
        if (s.indexOf('0') != -1) return false;  // 0 포함 X
        if (s.charAt(0) == s.charAt(1) || s.charAt(0) == s.charAt(2) || s.charAt(1) == s.charAt(2))
            return false;
        return true;
    }
    
    // candidate와 guess를 비교하여 [strike, ball] 값을 반환합니다.
    static int[] getCounts(String candidate, String guess) {
        int strike = 0, ball = 0;
        for (int i = 0; i < 3; i++) {
            if (candidate.charAt(i) == guess.charAt(i)) {
                strike++;
            } else if (candidate.indexOf(guess.charAt(i)) != -1) {
                ball++;
            }
        }
        return new int[]{strike, ball};
    }
    
    // 입력된 추측 정보를 담기 위한 클래스
    static class Guess {
        String number;
        int strike, ball;
        
        public Guess(String number, int strike, int ball) {
            this.number = number;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
