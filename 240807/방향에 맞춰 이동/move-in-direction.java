import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        int x = 0, y = 0;
        int[] dx = {-1, 0, 0, 1}; // W, S, N, E
        int[] dy = {0, -1, 1, 0}; // W, S, N, E
        String directions = "WSNE";

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            char direction = input[0].charAt(0);
            int distance = Integer.parseInt(input[1]);

            int index = directions.indexOf(direction);
            x += dx[index] * distance;
            y += dy[index] * distance;
        }

        System.out.println(x + " " + y);
        scanner.close();
    }
}