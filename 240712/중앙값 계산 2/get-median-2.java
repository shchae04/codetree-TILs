import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // maxHeap은 중앙값 이하의 숫자들을 저장
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // minHeap은 중앙값 초과의 숫자들을 저장
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            
            // 숫자를 적절한 힙에 추가
            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }
            
            // 힙 간의 균형 조정
            if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int temp = maxHeap.poll();
                maxHeap.offer(minHeap.poll());
                minHeap.offer(temp);
            }
            
            // 홀수 번째 원소일 때 중앙값 출력
            if (i % 2 == 1) {
                System.out.print(maxHeap.peek() + " ");
            }
        }
    }
}