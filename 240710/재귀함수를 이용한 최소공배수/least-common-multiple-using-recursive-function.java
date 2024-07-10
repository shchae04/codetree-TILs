import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = F(arr,0); //idx 0부터 시작
        System.out.println(result);

    }

    //배열과 idx 넘겨준다.
    public static int F(int[] arr, int idx){
        
        //배열의 끝인 경우 마지막 값 리턴.
        if(idx == arr.length-1){
            return arr[idx];
        }
        return lcm(arr[idx], F(arr, idx + 1));
    }


    //최대 공약수
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b); // b -> a | a%b 나머지
    }

    //최소 공배수
    public static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }
}