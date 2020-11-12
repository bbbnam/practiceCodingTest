package programmers.큰수만들기;


public class Solution3 {

    public String solution(String number, int k) {
        String answer = "";
        int right = number.length() - k;
        int left = 0;
        char [] charArray = number.toCharArray();
        char [] answerArray = new char[number.length()];
        int temp = 0;
        int max = 0;

       /* while () {
            //TODO 재작성
        }*/

        return String.valueOf(answerArray);
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.solution("1924", 2));
        System.out.println(solution.solution("1231234", 3));
        System.out.println(solution.solution("4177252841", 4));
    }
}
