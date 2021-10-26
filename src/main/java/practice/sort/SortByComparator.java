package practice.sort;

/*
input : [[1, 3], [2, 6], [8, 10], [15, 18]]
output : [[1, 6], [8, 10], [15, 18]]

before.end >= cur.start 이면
before.end = Math.max
            (cur.end, before.end 두개를 비교해서 더 큰값으로 지정);

1. 클래스(interval)
2. 리스트화(자료)
3. Comparator(버전)
4. 현재 start < 전 end, 새롭게 1, 6짜리 클래스를 만든다.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class SortByComparator {
    public static void main(String[] args) {
        // int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        SortByComparator sort = new SortByComparator();
        List<Interval> result = sort.merge(intervals);
        sort.print(result);
    }

    private List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return intervals;
        }

        // 1. 정렬부터 시작(sorting)
        Collections.sort(intervals, comp);
        //Collections.sort(intervals, Comparator.comparingInt(a -> a.start));

        List<Interval> result = new ArrayList<>();
        Interval before = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval cur = intervals.get(i);
            if (before.end >= cur.start) {
                before.end = Math.max(cur.end, before.end);
            } else {
                result.add(before);
                before = cur;
            }
        }
        if (!result.contains(before)) {
            result.add(before);
        }
        return result;
    }

    Comparator comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval in1, Interval in2) {
            return in1.start - in2.start;
        }
    };

    private void print(List<Interval> list) {
        for (int i = 0; i < list.size(); i++) {
            Interval interval = list.get(i);
            System.out.println(interval.start + " " + interval.end);
        }
    }
}
