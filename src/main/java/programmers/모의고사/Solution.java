package programmers.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int [] first = {1,2,3,4,5};
        int [] second = {2,1,2,3,2,4,2,5};
        int [] third = {3,3,1,1,2,2,4,4,5,5};

        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                firstCnt++;
            }
            if (answers[i] == second[i % second.length]) {
                secondCnt++;
            }
            if (answers[i] == third[i % third.length]) {
                thirdCnt++;
            }
        }
        int maxScore = Math.max(Math.max(firstCnt, secondCnt), thirdCnt);
        List<Integer> list = new ArrayList<>();
        if (maxScore == firstCnt) {
            list.add(1);
        }
        if (maxScore == secondCnt) {
            list.add(2);
        }
        if (maxScore == thirdCnt) {
            list.add(3);
        }
        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        //new Solution().solution(new int[] {1,2,3,4,5});
        new Solution().solution(new int[] {1,3,2,4,2});
    }
}
