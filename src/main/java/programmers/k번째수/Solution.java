package programmers.k번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int index = 0;

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            int [] tmp = new int[end - start + 1];
            int n = 0;
            for (int t = start - 1; t < end; t++) {
                tmp[n++] = array[t];
            }
            Arrays.sort(tmp);
            answer[index++] = tmp[target - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3},{4,4,1},{1,7,3}});
    }
}