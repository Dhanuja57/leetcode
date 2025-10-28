class Solution {
    private static boolean move(int[] nums,int s,int dir){
        int[] arr=nums.clone();
        int n=arr.length;
        int cur=s;
        int move=dir;

        while(cur>=0 && cur<n){
            if(arr[cur]==0){
                cur+=move;
            }
            else{
                arr[cur]--;
                move*=-1;
                cur+=move;
            }
        }
        for(int num : arr){
            if(num!=0) return false;

        }
        return true;
    }
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(move(nums,i,-1))  res++;
                if(move(nums,i,1))   res++;
            }
        }
        return res;
    }
}