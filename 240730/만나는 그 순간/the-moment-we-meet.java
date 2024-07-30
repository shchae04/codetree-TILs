import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 이동 내역 저장
        List<Move> movesA = new ArrayList<>();
        List<Move> movesB = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();
            movesA.add(new Move(direction, time));
        }
        
        for (int i = 0; i < M; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();
            movesB.add(new Move(direction, time));
        }
        
        // 현재 위치 계산
        List<Integer> positionsA = calculatePositions(movesA);
        List<Integer> positionsB = calculatePositions(movesB);
        
        // 첫 만남 시간 계산
        int meetingTime = -1;
        for (int t = 0; t < positionsA.size(); t++) {
            if (positionsA.get(t).equals(positionsB.get(t))) {
                meetingTime = t + 1;
                break;
            }
        }
        
        // 결과 출력
        System.out.println(meetingTime);
    }
    
    private static List<Integer> calculatePositions(List<Move> moves) {
        List<Integer> positions = new ArrayList<>();
        int position = 0;
        
        for (Move move : moves) {
            for (int i = 0; i < move.time; i++) {
                position += (move.direction == 'R') ? 1 : -1;
                positions.add(position);
            }
        }
        
        return positions;
    }
}

class Move {
    char direction;
    int time;
    
    Move(char direction, int time) {
        this.direction = direction;
        this.time = time;
    }
}