import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        sc.close();

        int length = a.length();
        int maxVal = -1;

        // 각 비트를 뒤집어볼 경우 확인
        for (int i = 0; i < length; i++) {
            char[] arr = a.toCharArray();
            // 해당 비트 반전
            arr[i] = (arr[i] == '0') ? '1' : '0';
            String candidate = new String(arr);

            // 후보를 10진수로 변환
            int val = Integer.parseInt(candidate, 2);

            // 최댓값 갱신
            if (val > maxVal) {
                maxVal = val;
            }
        }

        System.out.println(maxVal);
    }
}
