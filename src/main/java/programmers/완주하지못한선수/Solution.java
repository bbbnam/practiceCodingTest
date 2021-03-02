package programmers.완주하지못한선수;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[] {"mislav", "stanko", "mislav", "ana"},
                new String[] {"stanko", "ana", "mislav"}));
    }
}
