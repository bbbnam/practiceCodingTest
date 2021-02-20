package programmers.가운데글자가져오기;

public class Solution {
    public String solution(String str) {
        String answer = "";
        int strSize = str.length();
        int remainder = strSize % 2;
        int divided = strSize / 2;
        if (remainder == 0) { //짝수
            answer = String.valueOf(str.charAt(divided - 1)) + String.valueOf(str.charAt(divided));
        } else {
            answer = String.valueOf(str.charAt(divided));
        }
        return answer;
    }
}
