class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long[] minPref = new long[k];
        Arrays.fill(minPref, Long.MAX_VALUE);

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        minPref[0] = 0;

        for (int i = 0; i < n; i++) {
            prefix += nums[i];

            int mod = (i + 1) % k;

            if (minPref[mod] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix - minPref[mod]);
            }

            minPref[mod] = Math.min(minPref[mod], prefix);
        }

        return ans;
    }
}
