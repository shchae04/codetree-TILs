import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // 각 문자의 출현 빈도를 저장할 배열
        int[] freq1 = new int[128]; // ASCII 문자를 고려
        int[] freq2 = new int[128];

        // 각 문자열의 문자 빈도 계산
        for (char c : str1.toCharArray()) {
            freq1[c]++;
        }
        for (char c : str2.toCharArray()) {
            freq2[c]++;
        }

        // 빈도 비교
        boolean canForm = true;
        for (int i = 0; i < 128; i++) {
            if (freq1[i] != freq2[i]) {
                canForm = false;
                break;
            }
        }

        System.out.println(canForm ? "Yes" : "No");
    }
}