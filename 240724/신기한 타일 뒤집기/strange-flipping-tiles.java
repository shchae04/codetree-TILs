import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        TreeSet<Integer> white = new TreeSet<>();
        TreeSet<Integer> black = new TreeSet<>();
        int currentPosition = 0;

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int x = Integer.parseInt(command[0]);
            String direction = command[1];

            if (direction.equals("L")) {
                for (int j = 0; j < x; j++) {
                    int pos = currentPosition - j;
                    white.add(pos);
                    black.remove(pos);
                }
                currentPosition -= (x - 1);
            } else { // R
                for (int j = 0; j < x; j++) {
                    int pos = currentPosition + j;
                    black.add(pos);
                    white.remove(pos);
                }
                currentPosition += (x - 1);
            }
        }

        System.out.println(white.size() + " " + black.size());

        sc.close();
    }
}