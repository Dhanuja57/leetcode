class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;
        
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                // Flip the three elements starting from index i
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                operations++;
            }
        }
        
        // Check if there are any remaining 0s in the array
        for (int num : nums) {
            if (num == 0) {
                return -1; // Impossible case
            }
        }
        
        return operations;
    }
}
