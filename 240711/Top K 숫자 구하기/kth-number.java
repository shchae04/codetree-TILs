import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); //k 번째 숫자
        int[] words = new int[n];
        for(int i=0; i<words.length; i++){
            words[i] = sc.nextInt();
        }
        Integer[] arr = Arrays.stream(words).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);

        System.out.println(arr[k-1]);
    }
}