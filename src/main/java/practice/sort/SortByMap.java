package practice.sort;

import java.util.*;

public class SortByMap {
    public static void main(String[] args) {
        String[] words = {"i", "study", "inflearn", "i", "study", "coding"};
        int k = 3;
        //String[] words = {"a", "b", "c", "a", "b", "c", "a"};
        SortByMap sortByMap = new SortByMap();
        System.out.println(sortByMap.solve(words, k));
    }

    private List<String> solve(String[] words, int k) {
        // 1
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // 1. map
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 2. pq
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) ->
                a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());

        // 2. pq comparator
        Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if (a.getValue() == b.getValue()) {
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue() - a.getValue();
            }
        };
        Queue<Map.Entry<String, Integer>> pq2 = new PriorityQueue<>(comp);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq2.offer(entry);
        }

        while (k > 0) {
            result.add(pq2.poll().getKey());
            k--;
        }
        return result;
    }
}
