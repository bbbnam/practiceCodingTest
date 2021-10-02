package practice;

public class IndexOf {

    public static void main(String[] args) {
        //공통된 문자열을 찾아나가는 건데 앞에서부터 찾는 것 (중간에 공통부분이 들어가 있으면 공통 부분이 없다고 보는 가정을 해야함)
        String[] str = {"test", "teacher"};
        IndexOf indexOf = new IndexOf();
        System.out.println(indexOf.solution(str));
    }

    private String solution(String[] str) {
        if (str.length == 0) {
            return "";
        }

        String firstStr = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }
        }
        return firstStr;
    }
}
