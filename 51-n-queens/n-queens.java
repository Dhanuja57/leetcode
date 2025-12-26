import java.util.*;

class Solution {
    static int[] queen;
    static List<List<String>> res;

    static boolean check(int row, int col, int n) {
        int wrow, wcol;

        // TOP LEFT
        for (wrow = row - 1, wcol = col - 1; wrow >= 0 && wcol >= 0; wrow--, wcol--) {
            if (queen[wrow] == wcol)
                return false;
        }

        // TOP
        for (wrow = row - 1, wcol = col; wrow >= 0; wrow--) {
            if (queen[wrow] == wcol)
                return false;
        }

        // TOP RIGHT
        for (wrow = row - 1, wcol = col + 1; wrow >= 0 && wcol < n; wrow--, wcol++) {
            if (queen[wrow] == wcol)
                return false;
        }

        return true;
    }

    static void backtrack(int row, int n) {
        if (row == n) {
            res.add(buildBoard(n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (check(row, col, n)) {
                queen[row] = col;
                backtrack(row + 1, n);
                queen[row] = -1; // BACKTRACK
            }
        }
    }

    static List<String> buildBoard(int n) {
        List<String> board = new ArrayList<>();

        for (int r = 0; r < n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < n; c++) {
                if (queen[r] == c)
                    sb.append('Q');
                else
                    sb.append('.');
            }
            board.add(sb.toString());
        }
        return board;
    }

    public List<List<String>> solveNQueens(int n) {
        queen = new int[n];
        Arrays.fill(queen, -1);
        res = new ArrayList<>();

        backtrack(0, n);
        return res;
    }
}
