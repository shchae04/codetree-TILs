import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    
                            // 입력 받기
                                    int N = sc.nextInt();
                                            int S = sc.nextInt();
                                                    int[] arr = new int[N];
                                                            
                                                                    for (int i = 0; i < N; i++) {
                                                                                arr[i] = sc.nextInt();
                                                                                        }
                                                                                                
                                                                                                        int minDiff = Integer.MAX_VALUE;
                                                                                                                
                                                                                                                        // 두 개의 숫자를 제외하는 모든 조합 탐색
                                                                                                                                for (int i = 0; i < N; i++) {
                                                                                                                                            for (int j = i + 1; j < N; j++) {
                                                                                                                                                            int sum = 0;
                                                                                                                                                                            
                                                                                                                                                                                            // 합 계산 (i, j 인덱스를 제외한 나머지 합산)
                                                                                                                                                                                                            for (int k = 0; k < N; k++) {
                                                                                                                                                                                                                                if (k != i && k != j) {
                                                                                                                                                                                                                                                        sum += arr[k];
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                            // S와의 차이의 최소값 갱신
                                                                                                                                                                                                                                                                                                                                            minDiff = Math.min(minDiff, Math.abs(S - sum));
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                System.out.println(minDiff);
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    }
