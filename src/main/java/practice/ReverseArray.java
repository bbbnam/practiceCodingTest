package practice;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] reverse = reverseArray.reverse(new int[]{1, 2, 3});

        for (int number : reverse) {
            System.out.println("number>>" + number);
        }
    }

    public int[] reverse(int[] target) {
        int[] result = new int[target.length];
        int index = target.length - 1;
        for (int number : target) {
            result[index] = number;
            index--;
        }
        return result;
    }
}
