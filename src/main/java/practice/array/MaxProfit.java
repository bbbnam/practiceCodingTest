package practice.array;

/*- i번째 요소가 i 일에 주어진 주식의 가격 인 배열이 있다고 가정
- 최대 한번의 거래만 완료하도록 허용된 경우
        (즉, 주식을 하나 사고, 한 주식을 매도)
  최대 수익을 찾는 알고리즘을 설계하십시오.
- 주식을 구입하기 전에는 주식을 팔 수 없습니다.

input : { 8, 2, 6, 5, 1, 7, 5}
output : 6
description : 5일에 구매 (가격 = 1), 6일에 판매 (가격 = 7), 이익 = 7 - 1 = 6
*/

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {8, 2, 6, 5, 1, 7, 5};
        //int[] prices = {2, 3, 6, 1, 2, 3, 3};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] nums) {
        //1
        if(nums.length == 0) {
            return 0;
        }

        //2 담아야할 그릇
        int max = 0;
        int sofaMin = nums[0];

        //3 for, while
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < sofaMin) {
                sofaMin = nums[i]; // 8 2 => 2, 2 1 => 1
            } else {
                max = Math.max(max, nums[i] - sofaMin);
            }
        }

        return max;
    }
}
