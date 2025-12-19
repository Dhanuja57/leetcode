class Solution {
    public int maxProfit(int[] prices) {
        int minn=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++){
           if(prices[i]<minn) {minn=prices[i]; }
           maxpro=Math.max(maxpro,prices[i]-minn);
           
        }
        return maxpro;
    }
}