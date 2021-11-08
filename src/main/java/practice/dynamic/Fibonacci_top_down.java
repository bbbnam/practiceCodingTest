package practice.dynamic;

public class Fibonacci_top_down {
    public static void main(String[] args) {
        Fibonacci_top_down a = new Fibonacci_top_down();
        int n = 7;
        for (int i = 1; i <= n; i++) {
            System.out.println("1 호출전 i: " + i + " value : " + a.fibonacci(i));
        }
    }


    public int fibonacci(int n) {
        int[] bottomUp = new int[1000];
        System.out.println("2 fibonacci 호출 :" + n);

        bottomUp[1] = 1;
        bottomUp[2] = 1;

        for(int i = 3; i <= n; i++) {
            bottomUp[i] = bottomUp[i-1] + bottomUp[i-2];
        }
        return bottomUp[n];
    }
}
