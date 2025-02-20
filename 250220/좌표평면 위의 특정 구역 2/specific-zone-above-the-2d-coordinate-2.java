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

        // x축, y축 정렬된 리스트 생성
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            xList.add(points[i][0]);
            yList.add(points[i][1]);
        }

        Collections.sort(xList);
        Collections.sort(yList);

        // 전체 점들을 포함하는 직사각형의 최소 및 최대 좌표
        int minX = xList.get(0);
        int maxX = xList.get(N - 1);
        int minY = yList.get(0);
        int maxY = yList.get(N - 1);

        int minArea = (maxX - minX) * (maxY - minY);

        // 각 점을 하나씩 제거하면서 최소 직사각형 넓이 계산
        for (int i = 0; i < N; i++) {
            int removedX = points[i][0];
            int removedY = points[i][1];

            // 남은 점들의 x, y 값만 추출
            List<Integer> newXList = new ArrayList<>();
            List<Integer> newYList = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    newXList.add(points[j][0]);
                    newYList.add(points[j][1]);
                }
            }

            // 새로운 최소, 최대 x, y 값 찾기
            Collections.sort(newXList);
            Collections.sort(newYList);
            int newMinX = newXList.get(0);
            int newMaxX = newXList.get(newXList.size() - 1);
            int newMinY = newYList.get(0);
            int newMaxY = newYList.get(newYList.size() - 1);

            // 새로운 직사각형 넓이 계산
            int area = (newMaxX - newMinX) * (newMaxY - newMinY);
            minArea = Math.min(minArea, area);
        }

        return minArea;
    }
}
