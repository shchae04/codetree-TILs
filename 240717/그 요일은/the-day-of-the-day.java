import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String A = sc.nextLine();
        sc.close();
        
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int targetDayIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(A)) {
                targetDayIndex = i;
                break;
            }
        }

        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 2024년은 윤년
        
        int totalDays = 0;
        for (int m = m1; m < m2; m++) {
            totalDays += daysInMonth[m - 1];
        }
        totalDays += d2 - d1;

        int count = (totalDays / 7) + ((totalDays % 7 >= targetDayIndex) ? 1 : 0);
        
        System.out.println(count);
    }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int m1 = sc.nextInt();
    //     int d1 = sc.nextInt();
    //     int m2 = sc.nextInt();
    //     int d2 = sc.nextInt();
    //     String target = sc.next();

    //     int[] dayOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //     int day1Cnt = d1;
    //     int day2Cnt = d2;

    //     for (int i = 0; i < m1; i++) {
    //         day1Cnt += dayOfMonth[i];
    //     }

    //     for (int i = 0; i < m2; i++) {
    //         day2Cnt += dayOfMonth[i];
    //     }

    //     int diff = day2Cnt - day1Cnt + 1;
    //     int body = diff / 7;
    //     int rest = diff % 7;

    //     String[] date = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    //     int res = body;

    //     for (int i = 0; i < rest; i++) {
    //         if (date[i].equals(target)) {
    //             res++;
    //         }
    //     }

    //     System.out.print(res);
        

    // }
}