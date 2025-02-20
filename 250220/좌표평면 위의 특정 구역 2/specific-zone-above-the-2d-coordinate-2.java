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

        int minArea = Integer.MAX_VALUE;

        // x, y 좌표 각각 정렬
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            xList.add(points[i][0]);
            yList.add(points[i][1]);
        }

        Collections.sort(xList);
        Collections.sort(yList);

        // 현재 전체 점들을 포함하는 직사각형의 최대 범위
        int fullMinX = xList.get(0);
        int fullMaxX = xList.get(N - 1);
        int fullMinY = yList.get(0);
        int fullMaxY = yList.get(N - 1);
        int fullArea = (fullMaxX - fullMinX) * (fullMaxY - fullMinY);

        for (int i = 0; i < N; i++) {
            int removedX = points[i][0];
            int removedY = points[i][1];

            int minX = fullMinX, maxX = fullMaxX;
            int minY = fullMinY, maxY = fullMaxY;

            if (removedX == minX) minX = xList.get(1); // 최소 x가 삭제될 경우 2번째 최소 x 사용
            if (removedX == maxX) maxX = xList.get(N - 2); // 최대 x가 삭제될 경우 2번째 최대 x 사용
            if (removedY == minY) minY = yList.get(1); // 최소 y가 삭제될 경우 2번째 최소 y 사용
            if (removedY == maxY) maxY = yList.get(N - 2); // 최대 y가 삭제될 경우 2번째 최대 y 사용

            int area = (maxX - minX) * (maxY - minY);
            minArea = Math.min(minArea, area);
        }

        return minArea;
    }
}
