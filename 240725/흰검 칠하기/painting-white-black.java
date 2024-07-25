import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] colored = new int[200001];
        int cur_dir = 10000;

        // L: 흰색, R: 검은색 / 흰색2, 검은색2번 이상이면 회색
        int[] white = new int[200001];
        int[] black = new int[200001];
        int w = 0, b = 0, g = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String location = sc.next();

            if (location.equals("L")) {
                for (int j = cur_dir - x + 1; j <= cur_dir; j++) {
                    colored[j] = 1;
                    white[j]++;
                }
                cur_dir -= x - 1;
            } else {
                for (int j = cur_dir; j < cur_dir + x; j++) {
                    colored[j] = 2;
                    black[j]++;
                }
                cur_dir += x - 1;
            }
        }

        for (int i = 0; i < colored.length; i++) {
            if (white[i] >= 2 && black[i] >= 2) {
                g++;
            } else if (colored[i] == 1) {
                w++;
            } else if (colored[i] == 2) {
                b++;
            }
        }

        System.out.println(w + " " + b + " " + g);
    }
}