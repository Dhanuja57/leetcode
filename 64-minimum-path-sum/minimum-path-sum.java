class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;    // Number of rows
        int n = grid[0].length; // Number of columns
        
        // Fill first row (only possible to move right)
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        // Fill first column (only possible to move down)
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // Fill rest of the grid using min(top, left) + current cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        // Return the min path sum at bottom-right corner
        return grid[m - 1][n - 1];
    }
}
