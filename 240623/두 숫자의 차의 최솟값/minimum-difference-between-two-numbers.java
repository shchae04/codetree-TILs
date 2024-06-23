import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        //n개의 정수 입력
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //최솟값 보관할 값
        int temp = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // 같은 수 빼지 못하게
                if(i!=j){
                    if(arr[i] > arr[j]){
                        if(temp == 0){
                            temp = arr[i] - arr[j];
                        } 
                        temp = (temp <= arr[i] - arr[j]) ? temp : arr[i] -arr[j];  
                    } else {
                        if(temp == 0){
                            temp = arr[j] - arr[i];
                        } 
                        temp = (temp <= arr[j] - arr[i]) ? temp : arr[j] -arr[i];
                    }
                }
            }
        }
        System.out.println(temp);
    }
}