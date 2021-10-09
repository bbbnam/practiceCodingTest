package practice.array;

/*
입력 : int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
      int k = 7;
출력 : 4
*/

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        SubArraySum subArraySum = new SubArraySum();
        System.out.println(subArraySum.solution(nums, k));
    }

    // 1. 이중 for
    private int solution(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                //System.out.println("sum>>"+sum + " nums["+j+"]>"+nums[j]);
                if (sum == k) {
                   // System.out.println("i>>"+ i + " nums["+j+"]>");
                    count++;
                }
            }
        }

        return count;
    }
}
