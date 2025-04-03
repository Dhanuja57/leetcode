class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        if(n<3)return 0;

        int[] lm=new int [n];
        lm[0]=nums[0];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(lm[i-1],nums[i]);
        }

        int[] rm=new int[n];
        rm[n-1]=nums[n-1];
        for (int i=n-2;i>=0;i--){
            rm[i]=Math.max(rm[i+1],nums[i]);
        }
        long ans = 0;  
        for (int i = 1; i < n - 1; i++) {
            int left = lm[i - 1];
            int right = rm[i + 1];
            ans = Math.max(ans, (long)(left - nums[i]) * right); 
        }

        return ans;
    }
}