/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.*/


class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        int profit = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<prices[i-1]){
                 if(max!=Integer.MIN_VALUE)
                profit=profit+(max-min);
                max=Integer.MIN_VALUE;
                min = prices[i];
            }
            if(prices[i]>prices[i-1])
            {
                max=prices[i];
            }
        }
        if(max!=Integer.MIN_VALUE){
             profit=profit+(max-min);
        }
        return profit;
    }
}
