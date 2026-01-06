class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int curMax = 0, max = nums[0];
        int curMin = 0, min = nums[0];

        for (int x : nums) {
            curMax = Math.max(x, curMax + x);
            max = Math.max(max, curMax);

            curMin = Math.min(x, curMin + x);
            min = Math.min(min, curMin);

            total += x;
        }
        if (max < 0) return max;

        return Math.max(max, total - min);
    }
}
