package programmers.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private int solution(int[] nums) {
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() > max) {
            return max;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int result = new Solution().solution(new int[]{3, 1, 2, 3});
        System.out.println("result>>"+result);
    }
}
