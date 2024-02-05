//121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int soFarMinimum = prices[0];
        int maxProfit = 0,p;
        for (int i = 0; i < prices.length; i++) {
            if (soFarMinimum > prices[i])
                soFarMinimum = prices[i];
            else {
                p = prices[i] - soFarMinimum;
                maxProfit = Math.max(p, maxProfit);
            }
        }
        return maxProfit;
    }
}
