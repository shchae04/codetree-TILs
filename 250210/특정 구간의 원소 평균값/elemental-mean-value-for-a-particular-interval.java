import java.util.Scanner;

public class Main {

    private static final int MAX = 1000;
    private static int[] arr = new int[MAX];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // 모든 구간 체크
        //     0,0 - 0,1 - 0,2 
        //     1,0 - 1,1 - 1,2
        //     2,0 - 2,1 - 2,2
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                int sum = 0;

                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }

                int length = j - i + 1;

                if(sum % length == 0){
                    int avg = sum /length;

                    boolean flag = false;
                    for(int k=i; k<=j; k++){
                        if(arr[k] == avg){
                            flag = true;
                            break;
                        }
                    }

                    if(flag){
                        count++;
                    }
                }
                
            }
        }

        System.out.println(count);
    }
}