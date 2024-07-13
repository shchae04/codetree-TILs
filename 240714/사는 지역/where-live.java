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
        Arrays.sort(arr, (a, b) -> b.name.compareTo(a.name));
        
        // 정렬 후 첫 번째 원소 (사전순으로 가장 마지막 이름) 출력
        System.out.println("name " + arr[0].name);
        System.out.println("addr " + arr[0].pNum);
        System.out.println("city " + arr[0].locale);
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