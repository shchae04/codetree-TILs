import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();
        
        String result = checkSeason(Y, M, D);
        System.out.println(result);
    }
    
    public static String checkSeason(int Y, int M, int D) {
        if (!isValidDate(Y, M, D)) {
            return "-1";
        }
        
        if (M >= 3 && M <= 5) {
            return "Spring";
        } else if (M >= 6 && M <= 8) {
            return "Summer";
        } else if (M >= 9 && M <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
    
    public static boolean isValidDate(int Y, int M, int D) {
        if (M < 1 || M > 12) return false;
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(Y)) {
            daysInMonth[1] = 29;
        }
        
        return D >= 1 && D <= daysInMonth[M - 1];
    }
    
    public static boolean isLeapYear(int Y) {
        return (Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0);
    }
}