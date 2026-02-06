/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int *ans=(int*) malloc(numsSize*sizeof(int));
    int prefix[numsSize];
    int surfix[numsSize];
    prefix[0]=1;
    surfix[numsSize-1]=1;
    for(int i=1;i<numsSize;i++){
        prefix[i]=prefix[i-1]*nums[i-1];
    }
    for(int j=numsSize-2;j>=0;j--){
        surfix[j]=surfix[j+1]*nums[j+1];
    }
    for(int itr=0;itr<numsSize;itr++){
        ans[itr]=prefix[itr]*surfix[itr];
    }
    *returnSize = numsSize;
    return ans;
}