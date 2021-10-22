# 개념정리

1. Compare To()
2. Comparator
3. PriorityQueue 시간 복잡도(O(logn))
4. Binary Search 시간 복잡도(O(logn))

```java
//1
public int compareTo(){ 
    return A.compareTo(B);
}
1. A와 B가 같으면 0
2. A > B 이면 1
3. A < B 이면 -1 오름차순 (ex 1 2 3 이런식이면 2-3은 -1 음수)
        

//2
Comparator<Interval> comp2 = new Comparator<Interval>() {
    public int compare(Interval o1, Interval o2) {
        return o1.end - o2.end;
    }    
}

Comparator<Interval> comp = new Comparator<Interval>() {
    public int compare(Interval o1, Interval o2) {
        if(o1.end > o2.end) {
            return 1;
        } else if(o1.end < o2.end) {
            return - 1;
        } else {
            return 0;
        }
    }    
}

```