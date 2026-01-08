class Solution {
    static int r;
    static int c;

    public int dfs(int[][] grid, int i, int j, boolean[][] visited) {
    if (i < 0 || i >= r || j < 0 || j >= c ||
        visited[i][j] || grid[i][j] == 0)
        return 0;

    visited[i][j] = true;
    int area = 1;

    area += dfs(grid, i-1, j, visited);
    area += dfs(grid, i+1, j, visited);
    area += dfs(grid, i, j-1, visited);
    area += dfs(grid, i, j+1, visited);

    return area;
}



    public int maxAreaOfIsland(int[][] grid) {
         r=grid.length;
         c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
       // int count=0;
        int ans=0;
        int m=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                   // count++;
                    m=dfs(grid,i,j,visited);
                    //System.out.println(m);
                    ans=Math.max(m,ans);
                }
            }  
        }
        return ans;
    }
}