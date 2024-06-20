import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    int start = sc.nextInt(); // start
     int end = sc.nextInt(); // end

    int sum = 0;

    for (int i = start; i <= end; i++) {
 int k = 1;
 int cnt = 0; // 약수의 갯수 초기화

 while (k <= i) { // start 가 아닐때까지만 1 6
 if (i % k == 0) {
 cnt++;
 }
 k++;
 }

if (cnt == 3) { // 약수의 개수가 3개인 경우
 sum++;
 }
 }

 System.out.println(sum);
 sc.close();
}
}