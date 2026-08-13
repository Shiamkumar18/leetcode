class Solution {
    public int maxProfit(int[] prices) {
        // prices[i] is like buying stock
        int n = prices.length;
        int mini =prices[0];
        int Maxprofit=0;
        for(int i=1; i<n; i++){
            int profit=prices[i]-mini;
            Maxprofit=Math.max(profit,Maxprofit);
            mini=Math.min(mini,prices[i]);
        }
        return Maxprofit;
    }
}