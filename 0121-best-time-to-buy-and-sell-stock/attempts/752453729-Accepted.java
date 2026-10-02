class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice > lowPrice) {
                int currentProfit = currentPrice - lowPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }

            if (currentPrice < lowPrice) {
                lowPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}