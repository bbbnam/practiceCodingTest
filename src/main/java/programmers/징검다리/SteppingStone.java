package programmers.징검다리;

import java.util.*;

public class SteppingStone {
        public int solution(int distance, int[] rocks, int n) {
            int answer = 0;
            Arrays.sort(rocks);
            int first = 0;
            int last = distance;
            int mid = 0;
            while (first <= last) {
                int remove = 0;
                int prevRock = 0;
                mid = (first + last) / 2;
                for (int rock : rocks) {
                    if (rock - prevRock < mid) {
                        //임의로 mid를 기준으로 잡음(이분탐색을 위해)
                        remove++;
                    } else {
                        prevRock = rock;
                    }
                }

                //f (distance - prevRock < mid) {
                //제일 마지막 바위는 mid값이랑 비교 안하고 for문 나왔을테니 조건 걸어줌
                //remove++;
                //}이미 반이 넘었을 거기 때문에 불필요

                if (remove <= n) {
                    first = mid + 1;
                    answer = answer > mid ? answer : mid;
                } else {
                    last = mid - 1;
                }
            }


            return answer;
        }

    public static void main(String[] args) {
        SteppingStone steppingStone = new SteppingStone();
        System.out.println("4>>"+steppingStone.solution(25, new int[]{2,14,11,21,17}, 2));
    }
}
