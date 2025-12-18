/*class Solution {
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
}*/
class Solution {
    public int climbStairs(int n) {
        if(n<4) return n;
        int p1=3;
        int p2=2;int cur=0;
        for(int i=4;i<=n;i++){
            cur=p1+p2;
            p2=p1;
            p1=cur;
        }
     return p1;
    }
}