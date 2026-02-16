class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] surfix=new int[n];
        int[] ans=new int[n];
        prefix[0]=1;
        surfix[n-1]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            surfix[j]=surfix[j+1]*nums[j+1];
            ans[j+1]=prefix[j+1]*surfix[j+1];
        }
        ans[0]=prefix[0]*surfix[0];
        return ans;
    }
}