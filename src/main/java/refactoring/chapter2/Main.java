package refactoring.chapter2;

import refactoring.chapter2.before.FindIntBefore;

public class Main {
    public static void main(String[] args) {
        int[] data = {
                1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        if (FindIntBefore.find(data, 5)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found");
        }
    }
}