class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0, j = cols - 1; // Start from top-right corner

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        return false;
    }
}
