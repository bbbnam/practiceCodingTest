package programmers.문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        char[] chars = s.toCharArray();
        if (!(chars.length == 4 || chars.length == 6)) {
            return false;
        }
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result1 = new Solution().solution("a234");
        boolean result2 = new Solution().solution("1234");
        System.out.println("false>"+result1);
        System.out.println("true>"+result2);
    }
}
