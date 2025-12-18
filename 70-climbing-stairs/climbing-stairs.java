class Solution {
    static int[] dp;
    public static int fun(int x){
        if(x<3) return x;
        if(dp[x]!=-1) return dp[x];
        return dp[x]=fun(x-1)+fun(x-2);
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n);
    
    }
}