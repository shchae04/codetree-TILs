import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                    int N = scanner.nextInt();
                            int K = scanner.nextInt();
                                    int[] arr = new int[N];
                                            
                                                    for (int i = 0; i < N; i++) {
                                                                arr[i] = scanner.nextInt();
                                                                        }
                                                                                
                                                                                        System.out.println(maxSumSubarray(arr, K));
                                                                                                scanner.close();
                                                                                                    }

                                                                                                        public static int maxSumSubarray(int[] arr, int K) {
                                                                                                                int maxSum = 0, currentSum = 0;
                                                                                                                        
                                                                                                                                // 첫 번째 K개의 합을 구함
                                                                                                                                        for (int i = 0; i < K; i++) {
                                                                                                                                                    currentSum += arr[i];
                                                                                                                                                            }
                                                                                                                                                                    maxSum = currentSum;
                                                                                                                                                                            
                                                                                                                                                                                    // 슬라이딩 윈도우 적용
                                                                                                                                                                                            for (int i = K; i < arr.length; i++) {
                                                                                                                                                                                                        currentSum = currentSum - arr[i - K] + arr[i];
                                                                                                                                                                                                                    maxSum = Math.max(maxSum, currentSum);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                            return maxSum;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                