import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        scanner.close();
        System.out.println(getMinimumRectangleArea(N, points));
    }

    public static int getMinimumRectangleArea(int N, int[][] points) {
        if (N <= 3) return 0; // 최소 3개의 점만 남을 수 있으므로 넓이는 0

        // x, y 좌표 기준 정렬한 리스트 생성
        List<int[]> sortedByX = new ArrayList<>(Arrays.asList(points));
        List<int[]> sortedByY = new ArrayList<>(Arrays.asList(points));

        sortedByX.sort(Comparator.comparingInt(p -> p[0])); // x 기준 정렬
        sortedByY.sort(Comparator.comparingInt(p -> p[1])); // y 기준 정렬

        // 전체 직사각형의 경계값
        int minX = sortedByX.get(0)[0];
        int maxX = sortedByX.get(N - 1)[0];
        int minY = sortedByY.get(0)[1];
        int maxY = sortedByY.get(N - 1)[1];

        int minArea = (maxX - minX) * (maxY - minY);

        // 경계에 위치한 점들을 하나씩 제거하며 최소 넓이 계산
        for (int i = 0; i < N; i++) {
            int removedX = points[i][0];
            int removedY = points[i][1];

            // 새로운 min/max 값 구하기
            int newMinX = (removedX == minX) ? sortedByX.get(1)[0] : minX;
            int newMaxX = (removedX == maxX) ? sortedByX.get(N - 2)[0] : maxX;
            int newMinY = (removedY == minY) ? sortedByY.get(1)[1] : minY;
            int newMaxY = (removedY == maxY) ? sortedByY.get(N - 2)[1] : maxY;

            int area = (newMaxX - newMinX) * (newMaxY - newMinY);
            minArea = Math.min(minArea, area);
        }

        return minArea;
    }
}
