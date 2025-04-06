import java.util.*;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums); // Sort the input array
        int n = nums.length;
        
        int[] dp = new int[n]; // dp[i] will store the size of the largest divisible subset ending with nums[i]
        int[] prev = new int[n]; // to trace back the elements
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        
        int maxIndex = 0; // To track the index of the largest subset's last element

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }

        // Trace back to build the answer
        List<Integer> result = new ArrayList<>();
        int current = maxIndex;
        while (current != -1) {
            result.add(nums[current]);
            current = prev[current];
        }

        Collections.reverse(result); // Optional: to get the subset in increasing order
        return result;
    }
}
