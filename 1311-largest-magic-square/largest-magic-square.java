class Solution {
    public boolean left_right(int[][] grid, int r, int c, int size, int target) {
        for (int i = r+1; i < r + size; i++) {
            int sum = 0;
            for (int j = c; j < c + size; j++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }
        return true;
    }
    public boolean top_bottom(int[][] grid, int r, int c, int size, int target) {
        for (int j = c+1; j < c + size; j++) {
            int sum = 0;
            for (int i = r; i < r + size; i++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }
        return true;
    }
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = Math.min(m, n);
        for (int size = max; size >= 2; size--) {
            for (int r = 0; r + size <= m; r++) {
                for (int c = 0; c + size <= n; c++) {
                    int target = 0;
                    for (int j = c; j < c + size; j++) {
                        target += grid[r][j];
                    }
                    if (!left_right(grid, r, c, size, target)) continue;
                    if (!top_bottom(grid, r, c, size, target)) continue;
                    int d1 = 0;
                    for (int i = 0; i < size; i++) {
                        d1 += grid[r + i][c + i];
                    }
                    int d2 = 0;
                    for (int i = 0; i < size; i++) {
                        d2 += grid[r + i][c + size - 1 - i];
                    }
                    if (d1 == target && d2 == target) {
                        return size;
                    }
                }
            }
        }
        return 1; 
    }
}
