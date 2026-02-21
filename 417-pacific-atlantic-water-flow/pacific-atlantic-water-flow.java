class Solution {
    int dirs[][] = {{-1,0},{1,0},{0,1},{0,-1}};
     int m,n=0;
    void dfs(int x, int y, boolean vis[][], int heights[][]) {
        vis[x][y]=true;
        for(int[] dir : dirs){
            int ni=x+dir[0];
            int nj=y+dir[1];
            if(ni>=0 && ni<n && nj >=0 && nj<m && !vis[ni][nj] && heights[ni][nj]>=heights[x][y] ){
                dfs(ni,nj,vis,heights);
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> list = new ArrayList<>();
         n = heights.length;
          m = heights[0].length;
        boolean po[][] = new boolean[n][m];
        boolean ao[][] = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            dfs(i, 0, po, heights);
            dfs(i, m - 1, ao, heights);
        }
        for (int j = 0; j < m; j++) {
            dfs(0, j, po, heights);
            dfs(n - 1, j, ao, heights);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (po[i][j] && ao[i][j]) list.add(Arrays.asList(i, j));
            }
        }
        return list;
    }
}