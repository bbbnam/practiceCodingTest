package programmers.큰수만들기;


public class Solution {

    public String solution(String number, int k) {
        String answer = "";
        int targetSize = number.length() - k;
        int limitIndex = targetSize;
        char [] charArray = number.toCharArray();
        char [] answerArray = new char[targetSize];
        int t = 0;
        for (int i = 0; i < answerArray.length; i++ ) {
            while (t + 1 < limitIndex) {
                System.out.println("wile문 한번>>"+i+">>>"+t);
                answerArray[i] = charArray[t] >= charArray[t+1] ? charArray[t] : charArray[t+1];
                t++;
            }
            limitIndex++;
            System.out.println("limitIndex>>"+limitIndex);
        }

        return String.valueOf(answerArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1924", 2));
        System.out.println(solution.solution("1231234", 3));
        System.out.println(solution.solution("4177252841", 4));
    }
}
