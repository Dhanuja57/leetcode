import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks); // Sort to prioritize lower rank mechanics
        
        long left = 1, right = (long) ranks[0] * cars * cars;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canRepair(ranks, cars, mid)) {
                right = mid; // Try a smaller time
            } else {
                left = mid + 1; // Increase time
            }
        }
        return left;
    }

    private boolean canRepair(int[] ranks, int cars, long maxTime) {
        int totalCars = 0;
        for (int rank : ranks) {
            totalCars += Math.sqrt(maxTime / rank);
            if (totalCars >= cars) return true; // Enough cars repaired
        }
        return false;
    }
}
