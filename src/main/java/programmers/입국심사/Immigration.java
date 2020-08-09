package programmers.입국심사;

import java.util.*;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long maxTime = n * times[times.length-1]; //가능한 최대시간
        answer = findMinTime();

        return answer;
    }

    private long findMinTime() {
        //반 가르기 시작
    }
}
