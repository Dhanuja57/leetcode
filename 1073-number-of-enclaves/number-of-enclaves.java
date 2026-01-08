class Solution {
    static int c;
    static int r;
    public static void  dfs(int[][]grid,int i,int j){
        //System.out.println(i+" "+j);
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
         r=grid.length;
        c=grid[0].length;
        int count=0;

        for(int i=0;i<c;i++){
            if(grid[0][i]==1) dfs(grid,0,i);
        }
        for(int i=0;i<r;i++){
            if(grid[i][0]==1) dfs(grid,i,0);
        }
        for(int i=0;i<c;i++){
            if(grid[r-1][i]==1) dfs(grid,r-1,i);
        }
        for(int i=0;i<r;i++){
            if(grid[i][c-1]==1) dfs(grid,i,c-1);
        }

        for(int i=1;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                if(grid[i][j]==1) count++;
            }
        }
        return count;
    }
}