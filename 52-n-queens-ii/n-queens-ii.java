class Solution {
    static int[] Queen;

    static boolean IS_SAFE(int row, int col, int n) {
        int wrow, wcol;

        for (wrow = row - 1, wcol = col - 1; wrow >= 0 && wcol >= 0; wrow--, wcol--)
            if (Queen[wrow] == wcol) return false;

        for (wrow = row - 1; wrow >= 0; wrow--)
            if (Queen[wrow] == col) return false;

        for (wrow = row - 1, wcol = col + 1; wrow >= 0 && wcol < n; wrow--, wcol++)
            if (Queen[wrow] == wcol) return false;

        return true;
    }

    public int totalNQueens(int n) {
        Queen = new int[n];
        for (int i = 0; i < n; i++) Queen[i] = -1;

        int row = 0, col = 0, count = 0;

        while (row >= 0) {

            while (col < n) {
                if (IS_SAFE(row, col, n)) {
                    Queen[row] = col;
                    row++;
                    col = 0;
                    break;
                } else col++;
            }

            if (row == n) {
                count++;
                row--;
                col = Queen[row] + 1;
                Queen[row] = -1;
            }
            else if (col == n) {
                Queen[row] = -1;
                row--;
                if (row >= 0)
                    col = Queen[row] + 1;
            }
        }
        return count;
    }
}
