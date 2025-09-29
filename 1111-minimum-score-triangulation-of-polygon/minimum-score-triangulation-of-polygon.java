class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        Integer[][] memo = new Integer[n][n];
        return solve(values, 0, n - 1, memo);
    }

    private int solve(int[] values, int i, int j, Integer[][] memo) {
        if (j - i < 2) return 0;

        if (memo[i][j] != null) return memo[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {
            int left = solve(values, i, k, memo);
            int right = solve(values, k, j, memo);
            int tri = values[i] * values[k] * values[j]; 
            ans = Math.min(ans, left + right + tri);
        }
        memo[i][j] = ans; 
        return ans;
    }
}
