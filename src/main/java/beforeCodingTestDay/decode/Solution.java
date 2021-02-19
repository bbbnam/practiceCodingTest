package beforeCodingTestDay.decode;

public class Solution {
    public static void main(String[] args) {
        String [] text = {
            "   + -- + - + -   ",
            "   + --- + - +   ",
            "   + -- + - + -   ",
            "   + - + - + - +   "
        };
        //문제는 애매한데 답 나오는게 신기...
        solve(text);
    }

    private static void solve(String[] text) {
        for (int i = 0; i < text.length; i ++) {
            int num = Integer.parseInt(text[i].trim()
                        .replace(" ","")
                        .replace("+", "1")
                        .replace("-","0") , 2); //2진수 변환
            text[i] = String.valueOf((char)num);
            System.out.println(text[i]);
        }
    }
}
