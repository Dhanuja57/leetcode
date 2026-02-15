class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(m.containsKey(rem)){
                return new int[]{i,m.get(rem)};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}