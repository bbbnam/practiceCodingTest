package programmers.문자열내림차순으로정렬;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {
    public String solution(String s) {
        String answer = "";
        Character [] charArray = new Character[s.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = s.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        for (char  c: charArray) {
            answer += c;
        }
        return answer;
    }
}
