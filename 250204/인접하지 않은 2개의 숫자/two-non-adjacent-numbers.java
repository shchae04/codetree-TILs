import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    int n = sc.nextInt();
                            int[] arr = new int[n];
                                    
                                            for(int i = 0; i < n; i++){
                                                        arr[i] = sc.nextInt();
                                                                }
                                                                        
                                                                                int max = 0;
                                                                                        // 모든 두 수의 조합을 확인 (인접하지 않은 경우만)
                                                                                                for(int i = 0; i < n; i++){
                                                                                                            for(int j = i+1; j < n; j++){
                                                                                                                            if(i + 1 != j){ // 인접하지 않은 경우
                                                                                                                                                int cMax = arr[i] + arr[j];
                                                                                                                                                                    if(max < cMax) {
                                                                                                                                                                                            max = cMax;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                            System.out.println(max);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                