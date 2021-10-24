package practice.sort;
import java.util.*;
/*
양의 정수 길이의 두 막대기 연결할 수 있다.
x와 y의 비용을 지불한다 스틱 x + y =>
이런식으로 연결하여 스틱이 하나만 남을 때까지 모든 스틱을
연결 최소 비용을 반환 합니다.

input : 스틱 = [1, 8, 3, 5]
출력 : 30
설명 :
1. 1 + 3 = 4 의 비용, = [4, 8, 5] 가 됩니다.
2. 4 + 5 = 9 의 비용, = [9, 8] 이 됩니다.
3. 9 + 8 = 17 의 비용, = [17] 이 됩니다.
스틱이 하나만 남아 있으므로 완료
총 비용은 4 + 9 + 17 = 30 입니다.

*/
public class PriorityQueue_Test {
    public static void main(String[] args) {
        PriorityQueue_Test pq = new PriorityQueue_Test();
        int[] sticks = {1, 8, 2, 5};
        System.out.println(pq.pqSticks(sticks));
    }

    private int pqSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 기본이 minHeap
        // PriorityQueue 가 가장 상위에 무조건 작은 녀석들이 오게함(minHeap의 특징)
        for (int num : sticks) {
            pq.offer(num);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int twoSum = pq.poll() + pq.poll();
            sum += twoSum;  // 3 + 8 + 16
            pq.offer(twoSum);
        }

        return sum; // 27
    }
}
