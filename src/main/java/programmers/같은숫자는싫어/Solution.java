package programmers.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
                continue;
            }
            if (!stack.isEmpty() && stack.peek() != num) {
                stack.push(num);
                continue;
            }
        }
        int i = 0;
        answer = new int[stack.size()];
        for (int stackNum : stack) {
            answer[i] = stackNum;
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
       // new Solution().solution(new int[]{1,1,3,3,0,1,1});
        new Solution().solution(new int[]{4,4,4,3,3});
    }
}
