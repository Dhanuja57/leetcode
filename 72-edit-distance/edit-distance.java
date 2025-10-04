class Solution {
  public int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();
    int[][] dp = new int[m + 1][n + 1];

    // Fill with -1 to indicate uncomputed states
    for (int i = 0; i <= m; i++)
      for (int j = 0; j <= n; j++)
        dp[i][j] = -1;

    return helper(word1, word2, m, n, dp);
  }

  private int helper(String word1, String word2, int i, int j, int[][] dp) {
    // Base cases
    if (i == 0) return j; // insert all j chars
    if (j == 0) return i; // delete all i chars

    if (dp[i][j] != -1) return dp[i][j]; // memoized result

    // If last characters are same → no cost
    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
      dp[i][j] = helper(word1, word2, i - 1, j - 1, dp);
    } else {
      int insertOp = helper(word1, word2, i, j - 1, dp);     // insert
      int deleteOp = helper(word1, word2, i - 1, j, dp);     // delete
      int replaceOp = helper(word1, word2, i - 1, j - 1, dp); // replace

      dp[i][j] = 1 + Math.min(replaceOp, Math.min(insertOp, deleteOp));
    }

    return dp[i][j];
  }
}
