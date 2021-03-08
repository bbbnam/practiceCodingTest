package programmers.체육복;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int [] students = new int[n];

        for (int l : lost) {
            students[l-1]--;
        }
        for (int r : reserve) {
            students[r-1]++;
        }

        for(int i = 0; i < students.length; i++) {
            if (students[i] == -1) {
                if (i > 0 && students[i-1] == 1) {
                    students[i-1]--;
                    students[i]++;
                } else if (i+1 < students.length && students[i+1] == 1) {
                    students[i+1]--;
                    students[i]++;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //System.out.println(">>"+new Solution().solution(5, new int[] {2,4}, new int[] {1,3,5}));
        //System.out.println(">>"+new Solution().solution(5, new int[] {2,4}, new int[] {3}));
        System.out.println(">>"+new Solution().solution(3, new int[] {3}, new int[] {1}));
    }
}
