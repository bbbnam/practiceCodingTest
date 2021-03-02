package programmers.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int [] numbers) {
        int[] answer = {};
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int t = i+1; t < numbers.length; t++) {
                treeSet.add(numbers[i] + numbers[t]);
            }
        }

        int i = 0;
        answer = new int[treeSet.size()];
        for (int setNum : treeSet) {
            answer[i] = setNum;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(new int[]{5,0,2,7});
    }
}
