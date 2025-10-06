import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        
        // Min-heap storing [elevation, x, y]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{grid[0][0], 0, 0});
        
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int ans = 0;
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int height = cur[0], i = cur[1], j = cur[2];
            ans = Math.max(ans, height);
            
            // reached destination
            if (i == n - 1 && j == n - 1) return ans;
            
            if (vis[i][j]) continue;
            vis[i][j] = true;
            
            // explore 4 directions
            for (int[] d : dirs) {
                int ni = i + d[0];
                int nj = j + d[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n && !vis[ni][nj]) {
                    pq.add(new int[]{grid[ni][nj], ni, nj});
                }
            }
        }
        return ans;
    }
}
