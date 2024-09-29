import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        scanner.close();

        // 방향을 나타내는 배열: 북, 동, 남, 서
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0; // 처음 방향: 북쪽
        int x = 0, y = 0; // 현재 위치 (0, 0)
        
        for (int time = 0; time < commands.length(); time++) {
            char command = commands.charAt(time);
            
            if (command == 'L') {
                directionIndex = (directionIndex + 3) % 4; // 왼쪽으로 90도 회전
            } else if (command == 'R') {
                directionIndex = (directionIndex + 1) % 4; // 오른쪽으로 90도 회전
            } else if (command == 'F') {
                x += directions[directionIndex][0]; // x 좌표 업데이트
                y += directions[directionIndex][1]; // y 좌표 업데이트
            }
            
            // 현재 위치가 (0, 0)인지 확인
            if (x == 0 && y == 0) {
                System.out.println(time + 1); // 1초 단위로 카운트하므로 +1
                return;
            }
        }
        
        // 모든 명령을 실행했지만 (0, 0)으로 돌아오지 못한 경우
        System.out.println(-1);
    }
}