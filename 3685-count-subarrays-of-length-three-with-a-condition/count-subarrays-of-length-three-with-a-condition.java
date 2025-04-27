class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            double first = nums[i];
            double second = nums[i + 1];
            double third = nums[i + 2];
            if (first + third == second / 2.0) {
                count++;
            }
        }
        return count;
    }
}
