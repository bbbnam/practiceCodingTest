package practice.map;

import java.util.*;

public class MapDefault {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println("=========1==============");
        // 1
        for (Integer number : map.keySet()) {
            System.out.println("key : " + number + ", value : " + map.get(number));
        }

        System.out.println("=========2==============");
        // 2
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        System.out.println("=========3==============");
        // 3
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("key : " + key + ", value : " + map.get(key));
        }

        System.out.println("=========4==============");

        // etc
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collection<String> values = map.values();
        int index = 0;
        for (String value : values) {
            System.out.println("key : " + keys.get(index) + ", values : " + value);
            index++;
        }
    }
}
