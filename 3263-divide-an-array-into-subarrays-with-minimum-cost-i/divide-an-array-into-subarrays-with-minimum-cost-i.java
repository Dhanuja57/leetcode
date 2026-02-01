class Solution {
    public int minimumCost(int[] nums) {
        int sum=0;
    if(nums.length==3) {
        for(int itr=0;itr<3;itr++){
            sum+=nums[itr];
        }
        return sum;
    }
    int start=nums[0];
    int first=Integer.MAX_VALUE;
    int second=Integer.MAX_VALUE;
    for(int itr=1;itr<nums.length;itr++){
        if(nums[itr]<first){
            second=first;
            first=nums[itr];
        }
        else if(nums[itr]<second){
            second=nums[itr];
        }
    }

    return (start+first+second);
    }
}