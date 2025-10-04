class Solution {
  public int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();

    int[][] dp = new int[m + 1][n + 1];

    // Step 1: Initialize base cases
    for (int i = 0; i <= m; i++)
      dp[i][0] = i;  // Deleting all characters from word1

    for (int j = 0; j <= n; j++)
      dp[0][j] = j;  // Inserting all characters into word1

    // Step 2: Fill the table bottom-up
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {

        // If characters match → no extra operation
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1];
        } 
        // Otherwise → choose min of insert, delete, replace
        else {
          int insertOp = dp[i][j - 1];   // Insert into word1
          int deleteOp = dp[i - 1][j];   // Delete from word1
          int replaceOp = dp[i - 1][j - 1]; // Replace character

          dp[i][j] = 1 + Math.min(replaceOp, Math.min(insertOp, deleteOp));
        }
      }
    }

    // Step 3: The answer is in dp[m][n]
    return dp[m][n];
  }
}
