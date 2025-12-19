class Solution {
    public int maxProfit(int[] prices) {
        int minn=prices[0];
        int maxpro=0;
        for(int i=1;i<prices.length;i++){
           maxpro=Math.max(maxpro,prices[i]-minn);
           minn=Math.min(minn,prices[i]);
        }
        return maxpro;
    }
}