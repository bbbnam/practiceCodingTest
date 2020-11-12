package programmers.큰수만들기;


public class Solution2 {

    public String solution(String number, int k) {
        String answer = "";
        int right = number.length() - k;
        int left = 0;
        char [] charArray = number.toCharArray();
        char [] answerArray = new char[number.length()];
        int temp = 0;
        int max = 0;

        for (int i = 0; i < answerArray.length; i++ ) {
            while (left < right) {
                int num = Integer.parseInt(String.valueOf(charArray[left]));
                if (num > max) {
                    System.out.println("num>>"+num+"left>>"+left);
                    temp = left;
                    max = num;
                }
                left++;
                System.out.println("i>>>"+i+"left>>"+left);
            }
            answerArray[i] = (char)(max + '0');
            left = temp + 1;
            right++;
            max = 0;
            if (right > answerArray.length) {
                break;
            }
        }

        return String.valueOf(answerArray);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.solution("1924", 2));
        System.out.println(solution.solution("1231234", 3));
        System.out.println(solution.solution("4177252841", 4));
    }
}
