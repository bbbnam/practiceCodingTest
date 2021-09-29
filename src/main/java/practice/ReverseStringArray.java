package practice;

public class ReverseStringArray {

    public static void main(String[] args) {
        ReverseStringArray reverseArray = new ReverseStringArray();
        String[] reverse = reverseArray.reverse(new String[]{"A", "B", "C"});

        for (String number : reverse) {
            System.out.println("number>>" + number);
        }
    }

    public String[] reverse(String[] target) {
        String[] result = new String[target.length];
        int index = target.length - 1;
        for (String number : target) {
            result[index] = number;
            index--;
        }
        return result;
    }
}
