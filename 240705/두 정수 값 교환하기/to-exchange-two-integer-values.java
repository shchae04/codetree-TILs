import java.util.Scanner;
class IntWrapper {
        int value;

        public IntWrapper(int value){
            this.value = value;
        }
    }
public class Main {
    // 두 정수를 교환하는 함수
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
        
    //     // 두 정수 입력 받기
    //     int n = scanner.nextInt();
    //     int m = scanner.nextInt();
        
    //     // 배열에 두 정수 저장
    //     int[] numbers = {n, m};
        
    //     // swap 함수 호출
    //     swap(numbers);
        
    //     // 교환된 결과 출력
    //     System.out.println(numbers[0] + " " + numbers[1]);
        
    //     scanner.close();
    // }

    

    public static void swap(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

    public static void main(String[] args) {
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // java의 경우 int값을 그대로 넘겨 swap을 기대하기는 어렵기에,
        // IntWrapper라는 객체를 만들어 넘기는 방식으로 해결합니다.
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);

        swap(nWrapper, mWrapper);

        // 교환 이후 값을 다시 넣어줍니다.
        n = nWrapper.value;
        m = mWrapper.value;

        System.out.println(n + " " + m);
    }
}