import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 직사각형 A 입력
        int ax1 = scanner.nextInt(), ay1 = scanner.nextInt();
        int ax2 = scanner.nextInt(), ay2 = scanner.nextInt();

        // 직사각형 B 입력
        int bx1 = scanner.nextInt(), by1 = scanner.nextInt();
        int bx2 = scanner.nextInt(), by2 = scanner.nextInt();

        // 직사각형 M 입력
        int mx1 = scanner.nextInt(), my1 = scanner.nextInt();
        int mx2 = scanner.nextInt(), my2 = scanner.nextInt();

        // A와 M의 겹치지 않는 면적 계산
        int remainingA = calculateRemainingArea(ax1, ay1, ax2, ay2, mx1, my1, mx2, my2);

        // B와 M의 겹치지 않는 면적 계산
        int remainingB = calculateRemainingArea(bx1, by1, bx2, by2, mx1, my1, mx2, my2);

        // 남은 총 면적
        int totalRemainingArea = remainingA + remainingB;

        System.out.println(totalRemainingArea);

        scanner.close();
    }

    private static int calculateRemainingArea(int x1, int y1, int x2, int y2, int mx1, int my1, int mx2, int my2) {
        // 전체 면적
        int totalArea = (x2 - x1) * (y2 - y1);

        // 겹치는 영역 계산
        int overlapLeft = Math.max(x1, mx1);
        int overlapRight = Math.min(x2, mx2);
        int overlapBottom = Math.max(y1, my1);
        int overlapTop = Math.min(y2, my2);

        int overlapArea = 0;
        if (overlapLeft < overlapRight && overlapBottom < overlapTop) {
            overlapArea = (overlapRight - overlapLeft) * (overlapTop - overlapBottom);
        }

        // 남은 면적 반환
        return totalArea - overlapArea;
    }
}