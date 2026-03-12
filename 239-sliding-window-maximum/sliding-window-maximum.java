class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            //remove out data
            if(!dq.isEmpty() && dq.peekFirst()==i-k) dq.pollFirst();
            //remove if lesser value until its great
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            //add to dq ,default for all
            dq.offerLast(i);
            //to store in ans
            if(i>=k-1){
                ans[i-k+1]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}