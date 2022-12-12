link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
run time: 10ms
memory:84.4MB

class Solution {
    public int maxProfit(int[] prices) {
        int mx=0,r=1;
        for(int l=0;l<prices.length && r<prices.length;)
        {
            int profit=prices[r]-prices[l];
            mx=Math.max(mx,profit);
            if(prices[l]>prices[r]) l=r;
            r++;
        }
        return mx;
    }
}
Console
