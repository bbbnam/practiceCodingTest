package practice;

public class Solution1 {

    public static void main(String[] args) {
        //기준 날짜와 해당 날짜로부터 몇일 후인지가 주어졌을 때,
        // 그 날이 무슨 요일인지 구하는 테스트
        Solution1 ttt = new Solution1();
        System.out.println(ttt.solution("Tue", 7));
    }

    public String solution(String S, int K) {
        String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int startIndex = 0;
        int movedIndex = K % days.length;
        int resultIndex = 0;
        for (String day : days) {
            if (S.equals(day)) {
                break;
            }
            startIndex++;
        }
        resultIndex = (startIndex + movedIndex);
        if (resultIndex >= 7) {
            resultIndex = resultIndex % 7;
        }
        return days[resultIndex];
    }
}
