class Solution {
    public int nthUglyNumber(int n) {
                int[] ans=new int[n+1];
        ans[0]=1;
        int a2=0;
        int a3=0;
        int a5=0;
        for (int itr = 1; itr < n; itr++) {
            int next2 = ans[a2] * 2;
            int next3 = ans[a3] * 3;
            int next5 = ans[a5] * 5;
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            ans[itr] = nextUgly;
            if (nextUgly == next2) a2++;
            if (nextUgly == next3) a3++;
            if (nextUgly == next5) a5++;
        }
        return ans[n-1];
    }
}