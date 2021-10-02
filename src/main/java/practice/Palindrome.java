package practice;

public class Palindrome {
    // 문자열 s의 substring에서 가장 긴 회문 리턴하세요.
    public static void main(String[] args) {
        //String input = "banana"; //anana
        String input = "babad";  // bab
        //String input = "ac";     // a
        //String input = "bbbb";   // bbbb
        //String input = "abba";   // abba
        Palindrome palindrome = new Palindrome();
        String output = palindrome.solution(input);
        System.out.println("output>>" + output);
    }

    int startIndex = 0;
    int endIndex = 0;
    private String solution(String input) {
        if (input.length() == 1) {
            return input;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.length() % 2 == 0) {
                findPalindrome(input, i, i+1);
                continue;
            }
            findPalindrome(input, i, i);

        }
        return input.substring(startIndex, endIndex + startIndex);
    }

    private void findPalindrome(String input, int left, int right) {
        while (0 <= left && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        if (endIndex < right - left - 1) { //요게 핵심
            startIndex = left + 1;
            endIndex = right - left -1;
        }
        System.out.println("left>>"+ left + "<right>>" + right);
        System.out.println("startIndex>>"+ startIndex + "<endIndex>>" + endIndex);
    }
}
