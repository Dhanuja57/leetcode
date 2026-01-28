/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *res=malloc(50);
    for(int outer=0;outer<numsSize;outer++){
        for(int inner=outer+1;inner<numsSize;inner++){
       if(nums[outer]+nums[inner]==target){
        res[0]=outer;
        res[1]=inner;
        *returnSize=2;
        return res;
       }
        }
    }
  return 0;
}