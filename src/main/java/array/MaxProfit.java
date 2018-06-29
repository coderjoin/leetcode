package array;

/**
 * Created by qiaoying on 2018/6/28.
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0){
            return 0;
        }
        int minProfit = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > minProfit){
                profit += prices[i] - minProfit;
                minProfit = prices[i];
            }else {
                minProfit = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] a = {7,6,4,3,1};
        int profit = maxProfit(a);
        System.out.println(profit);
    }
}
