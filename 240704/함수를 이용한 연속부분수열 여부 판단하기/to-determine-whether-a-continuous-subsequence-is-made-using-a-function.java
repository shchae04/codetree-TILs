import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aCount = sc.nextInt();
    int bCount = sc.nextInt();

    int[] A = new int[aCount];
    int[] B = new int[bCount];

    for(int i = 0; i < aCount; i++){
        A[i] = sc.nextInt();
    }
    for(int i = 0; i < bCount; i++){
        B[i] = sc.nextInt();
    }

    String result = calc(A, B);
    System.out.println(result);
}

    public static String calc(int[] a, int[] b) {
        //6-3 까지
    for (int i = 0; i <= a.length - b.length; i++) {
        //같은지 확인
        boolean isSubsequence = true;
        for (int j = 0; j < b.length; j++) {
            //00 11 22 
            //10 21 32
            //20 31 42
            if (a[i + j] != b[j]) {
                isSubsequence = false;
                break;
            }
        }
        if (isSubsequence) {
            return "Yes";
        }
    }
    return "No";
}
}