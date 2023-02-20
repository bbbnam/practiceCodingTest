package java_coding_book;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        String str = "abcdd";
        MySolution mySolution = new MySolution();
        int countedStr = mySolution.countStr(str);
        System.out.println("count : " + countedStr);

        // 중복 갯수는 제외하고 셀 수 있음
        BookSolution_1 bookSolution1 = new BookSolution_1();
        Map<Character, Integer> result = bookSolution1.countDuplicateCharacters(str);
        System.out.println("map count : " + result.size());

        BookSolution_2 bookSolution2 = new BookSolution_2();
        Map<Character, Long> result2 = bookSolution2.countDuplicateCharacters(str);
        System.out.println("map count2 : " + result2.size());
    }

    static class MySolution {

        int countStr(String str) {
            int count = 0;
            for (char ch : str.toCharArray()) {
                count++;
            }
            return count;
        }
    }

    static class BookSolution_1 {
        Map<Character, Integer> countDuplicateCharacters(String str) {
            Map<Character, Integer> result = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
            }
            return result;
        }
    }

    static class BookSolution_2 {
        Map<Character, Long> countDuplicateCharacters(String str) {
            Map<Character, Long> result = str.chars()
                    .mapToObj(ch -> (char) ch)
                    .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
            return result;
        }
    }
}
