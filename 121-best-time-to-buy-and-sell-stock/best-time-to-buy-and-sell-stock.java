class Solution {
    public int maxProfit(int[] prices) {
        int minn=prices[0];
        int maxpro=0;
        for(int i=1;i<prices.length;i++){
           if(prices[i]<minn) {minn=prices[i]; }
           maxpro=Math.max(maxpro,prices[i]-minn);
           
        }
        return maxpro;
    }
}