class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // For single element
        if (n == 1) return 0;

        // Check first element
        if (nums[0] > nums[1]) return 0;

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i])
                return i;
        }

        // If no peak found in middle, last element must be a peak
        return n - 1;
    }
}
