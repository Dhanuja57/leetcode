class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1, right = (int)1e9;  // Search range based on problem constraints
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canRob(nums, k, mid)) {
                right = mid;  // Try a smaller capability
            } else {
                left = mid + 1;  // Increase capability
            }
        }
        
        return left;  // The minimum valid capability
    }
    
    private boolean canRob(int[] nums, int k, int cap) {
        int count = 0, i = 0;
        
        while (i < nums.length) {
            if (nums[i] <= cap) {
                count++;   // Rob this house
                i++;       // Skip next house (avoid adjacent robbery)
            }
            i++; // Move to the next house
        }
        
        return count >= k;  // Check if we can rob at least `k` houses
    }
}
