import java.util.Scanner;

public class Main {
    public static void printNLines(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++){
                System.out.print(j+1);
            }
            System.out.print("^&*()_");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printNLines(rowNum);
    }
}