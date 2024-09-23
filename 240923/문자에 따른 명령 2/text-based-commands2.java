import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        scanner.close();

        int x = 0, y = 0;
        int dx = 0, dy = 1;  // 초기 방향: 북쪽

        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                // 왼쪽으로 90도 회전
                int temp = dx;
                dx = -dy;
                dy = temp;
            } else if (command == 'R') {
                // 오른쪽으로 90도 회전
                int temp = dx;
                dx = dy;
                dy = -temp;
            } else if (command == 'F') {
                // 현재 방향으로 한 칸 이동
                x += dx;
                y += dy;
            }
        }

        System.out.println(x + " " + y);
    }
}