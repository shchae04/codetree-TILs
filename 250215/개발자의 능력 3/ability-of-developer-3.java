import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write yur code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int total = 0;
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int count1, count2;

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<6; i++){
            for(int j=i+1; j<6; j++){
                for(int k=j+1; k<6; k++){
                    count1 = arr[i] + arr[j] + arr[k];
                    count2 = total - count1;
                    int diff = Math.abs(count1 - count2);
                    if(diff< minDiff) {
                        minDiff =diff;
                    }
                }
            }
        }

        System.out.println(minDiff);
    }
}