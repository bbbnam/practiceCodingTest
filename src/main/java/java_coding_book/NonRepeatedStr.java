package java_coding_book;

public class NonRepeatedStr {
    public static void main(String[] args) {
        String repeatedStr = "aaabbbccccddddebc";
        char ch = solve_1(repeatedStr);
        System.out.println("first non repeated str>> " + ch);
    }

    private static final int ASCII_CODE_COUNT = 256;
    public static char solve_1(String str){
        int[] flags = new int[ASCII_CODE_COUNT];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < ASCII_CODE_COUNT; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }
}
