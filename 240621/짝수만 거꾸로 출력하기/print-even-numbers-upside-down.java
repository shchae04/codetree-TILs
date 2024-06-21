import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        
        sc.close();
    }

    // 입력받은 수들을 거꾸로 보면서 짝수인 값만 출력합니다.
        // for(int i = n - 1; i >= 0; i--) {
        //     if(arr[i] % 2 == 0)
        //         System.out.print(arr[i] + " ");
        // }
}