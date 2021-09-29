package practice;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(">>"+reverseString.reverse("ABC"));
    }

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

//        int index = chars.length;
//        while(index-- > 0) {
//            sb.append(str.charAt(index));
//        }
        return sb.toString();
    }
}
