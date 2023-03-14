package practice.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparisonList {
    public static void main(String[] args) {
        ArrayList<String> list_1 = new ArrayList<>();
        list_1.add("A");
        list_1.add("B");
        list_1.add("C");

        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("D");
        list_2.add("E");
        list_2.add("F");

        System.out.println("contains1? = " + list_1.containsAll(list_2));
        System.out.println("contains2? = " + Arrays.equals(list_1.toArray(), list_2.toArray()));
        // 그 외... 원소별로 for문 돌려서 확인하기
    }
}
