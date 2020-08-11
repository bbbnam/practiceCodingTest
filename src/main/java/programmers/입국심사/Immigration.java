package programmers.입국심사;

import java.util.*;

public class Immigration {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        return BinarySearch(n, times);
    }

    private long BinarySearch(int n, int[] times) {
        long minTime = 1;
        long slower = times[times.length-1]; // 이 부분 이렇게 변수로 안빼면 시간때문에 걸리는듯..
        long maxTime = n * slower; //가능한 최대시간
        long mid = 0;
        long answer = maxTime;

        while (minTime <= maxTime){
            mid = (minTime + maxTime) / 2;

            if ( isSmallNode(times, mid, n)) {
                answer = answer > mid ? mid : answer;
                maxTime = mid - 1;
            }  else {
                minTime = mid + 1;
            }
        }
        return answer;
    }

    private boolean isSmallNode(int[] times, long mid, long n) {
        long sum = 0;

        for (int time : times) {
            sum += mid / time;
        }

        if (sum >= n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Immigration immigration = new Immigration();
        System.out.println(">"+immigration.solution(6, new int[]{7,10})); // 28
        System.out.println(">"+immigration.solution(5, new int[]{2,5,6})); // 6
    }
}
