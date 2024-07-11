import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        //정수 N
        int n = sc.nextInt();

        //수열 A
        int[] A = new int[n];
        int[] B = new int[n];

        //수열에 값 세팅
        for(int i=0; i<n; i++){
            A[i] =sc.nextInt();
        }
        for(int i=0; i<n; i++){
            B[i] =sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        F(A,B);

        //정렬 후 처음부터 비교 전부 같으면 Yes else No
    }

    public static void F(int[] A, int[] B){
        
        boolean flag = false;
        for(int i=0; i<A.length; i++){
            if(A[i] == B[i]){
                flag = true;
            } else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}