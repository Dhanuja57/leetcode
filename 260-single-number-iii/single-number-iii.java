class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
       int setbit=(ans)&(-ans);
       int[] res=new int[2];
       for(int num:nums){
        if((num & setbit)==0) res[0]^=num;
        else res[1]^=num;
       }
       return res;
    }
}