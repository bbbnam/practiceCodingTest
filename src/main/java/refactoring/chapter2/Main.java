package refactoring.chapter2;

import refactoring.chapter2.afterBreak.FindInt;
import refactoring.chapter2.before.FindIntBefore;

public class Main {
    public static void main(String[] args) {
        int[] data = {
                1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        if (FindInt.find(data, 5)) {
            System.out.println("Found!");
        } else { // if else 문도 얼리 리턴 같은 식으로 하면 제거할 수 있을 거 같은데 void에서는 어떻게 하지?
            System.out.println("Not Found");
        }
    }
}
