import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Addr[] arr = new Addr[n];
        for(int i=0; i<n; i++){
            String name = sc.next();
            String pNum = sc.next();
            String locale = sc.next();
            
            arr[i] = new Addr(name, pNum, locale);
        }
        
        // 이름을 기준으로 정렬
        // Arrays.sort(arr, (a, b) -> b.name.compareTo(a.name));

        //정렬 (사전순으로 이름이 가장 느린 사람 찾기)
        int lastIdx = 0;
        for(int i=1; i<n; i++){
            //s1 == s2 -> 0
            //s1 사전순 뒤에오면 1
            //s1 사전순 앞에오면 -1
            if (arr[i].name.compareTo(arr[lastIdx].name) > 0){
                lastIdx = i;
            }
        }
        
        // 정렬 후 첫 번째 원소 (사전순으로 가장 마지막 이름) 출력
        System.out.println("name " + arr[lastIdx].name);
        System.out.println("addr " + arr[lastIdx].pNum);
        System.out.println("city " + arr[lastIdx].locale);
    }
}

class Addr {
    String name;
    String pNum;
    String locale;
    
    public Addr(String name, String pNum, String locale){
        this.name = name;
        this.pNum = pNum;
        this.locale = locale;
    }
}