int minimumCost(int* nums, int numsSize) {
    int sum=0;
    if(numsSize==3) {
        for(int itr=0;itr<3;itr++){
            sum+=nums[itr];
        }
         return sum;
    }
    int start=nums[0];
    int first=INT_MAX;
    int second=INT_MAX;
    for(int itr=1;itr<numsSize;itr++){
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