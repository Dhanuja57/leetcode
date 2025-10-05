class Solution {
    private void dfs(int[][] grid,int[][] time,int i,int j,int ct){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length||grid[i][j]==0 || ct>=time[i][j]) return;

        time[i][j]=ct;
        dfs(grid,time,i-1,j,ct+1);
        dfs(grid,time,i+1,j,ct+1);
        dfs(grid,time,i,j-1,ct+1);
        dfs(grid,time,i,j+1,ct+1);

    }
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return -1;
        int r=grid.length,c=grid[0].length;
        int [][] time=new int[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              if(grid[i][j]==2){
                dfs(grid,time,i,j,0);
              }
            }
        }
        int tr=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    tr=Math.max(tr,time[i][j]);
                }
            }
        }
        return tr;
    }
}