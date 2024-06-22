import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; //크기가 10인 정수 배열

        int sum = 0; //짝수번째 합
        int cnt = 0; //3의 배수 갯수
        int oddSum =0; //3의 배수 합
        double avg = 0;
       for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        //짝수 번째로 입력된 값의 합
        for (int i = 1; i < 10; i += 2) { //0 2 4 6 8
            sum += arr[i];
        }

        for(int i=2; i<9; i+=3){// 2 5 8
            if(i!=0){
                oddSum += arr[i];
            }
        }
        avg = (double)oddSum/3;
        System.out.printf("%d %.1f", sum, avg);
    }
}