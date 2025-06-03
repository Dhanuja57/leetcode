class Solution {
    // Helper function to calculate combinations (n choose k) - C(n, k)
    private long combinations(int n, int k) {
        // If k is invalid (negative or greater than n), there are no combinations
        if (k < 0 || k > n) return 0;
        // Optimization: C(n, k) = C(n, n-k), choose the smaller k to reduce computations
        if (k > n / 2) k = n - k;
        // Calculate combinations iteratively to avoid overflow
        long res = 1;
        for (int i = 1; i <= k; ++i)
            res = res * (n - i + 1) / i;
        return res;
    }

    public long distributeCandies(int n, int limit) {
        // 1. Calculate the total number of ways without any limits (C(n+2, 2))
        long ans = combinations(n + 2, 2);

        // 2. Subtract the cases where ONE child gets more than 'limit' candies
        ans -= 3 * combinations(n - limit + 1, 2);

        // 3. Add back the cases where TWO children get more than 'limit' candies (correction)
        ans += 3 * combinations(n - 2 * limit, 2);

        // 4. Subtract the cases where ALL THREE children get more than 'limit' candies (correction)
        ans -= combinations(n - 3 * limit - 1, 2);

        return ans; // Return the final number of ways
    }
}