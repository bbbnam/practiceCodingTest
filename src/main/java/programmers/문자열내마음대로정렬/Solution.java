package programmers.문자열내마음대로정렬;

import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char a1 = o1.charAt(n);
                char a2 = o2.charAt(n);

                if (a1 == a2) {
                    return o1.compareTo(o2);
                }
                return a1 - a2;
            }
        });
        return strings;
    }
}
