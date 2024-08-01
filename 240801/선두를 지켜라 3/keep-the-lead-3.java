import java.util.Scanner;

public class Main {
    static final int MAX_RANGE = 1000000;
    static int[] a_pos = new int[MAX_RANGE + 1];
    static int[] b_pos = new int[MAX_RANGE + 1];
    static int n, m, cnt;
    static String last_winner = "", curr_winner;

    public static void initialize() {
        for (int i = 0; i <= MAX_RANGE; i++) {
            a_pos[i] = Integer.MIN_VALUE;
            b_pos[i] = Integer.MIN_VALUE;
        }
        a_pos[0] = 0;
        b_pos[0] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        initialize();
        
        int a_idx = 0, b_idx = 0;
        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                a_idx++;
                a_pos[a_idx] = a_pos[a_idx - 1] + v;
            }
        }
        
        for (int i = 1; i <= m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                b_idx++;
                b_pos[b_idx] = b_pos[b_idx - 1] + v;
            }
        }
        
        for (int i = 1; i <= Math.max(a_idx, b_idx); i++) {
            if (a_pos[i] == Integer.MIN_VALUE)
                a_pos[i] = a_pos[i - 1];
            if (b_pos[i] == Integer.MIN_VALUE)
                b_pos[i] = b_pos[i - 1];
        }
        
        for (int i = 1; i <= Math.max(a_idx, b_idx); i++) {
            if (a_pos[i] < b_pos[i])
                curr_winner = "b";
            else if (a_pos[i] > b_pos[i])
                curr_winner = "a";
            else
                curr_winner = "ab";

            if (!curr_winner.equals(last_winner)) {
                cnt++;
                last_winner = curr_winner;
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}