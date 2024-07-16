import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        String result = calculateDayOfWeek(m1, d1, m2, d2);
        System.out.println(result);
    }

    public static String calculateDayOfWeek(int m1, int d1, int m2, int d2) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int totalDays = -1; // Start from -1 because we want to include the start date

        // Calculate days between m1/d1 and m2/d2
        if (m1 <= m2) {
            for (int m = m1; m < m2; m++) {
                totalDays += daysInMonth[m - 1];
            }
            totalDays += d2 - d1;
        } else {
            for (int m = m1; m <= 12; m++) {
                totalDays += daysInMonth[m - 1];
            }
            for (int m = 1; m < m2; m++) {
                totalDays += daysInMonth[m - 1];
            }
            totalDays += d2;
            totalDays -= d1;
        }

        int dayIndex = totalDays % 7;
        if (dayIndex < 0) {
            dayIndex += 7;
        }

        return daysOfWeek[dayIndex];
    }
}