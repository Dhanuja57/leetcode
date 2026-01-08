class Solution {
    static int r;
    static int c;
    public void dfs(char grid[][],int i,int j){
        if(i<0|| i>=r||j<0||j>=c ){
            return;
        }
       if(grid[i][j]=='1' ){
         grid[i][j]=0;
       dfs(grid,i-1,j);
       dfs(grid,i+1,j);
       dfs(grid,i,j-1);
       dfs(grid,i,j+1);
       }
    }
    public int numIslands(char[][] grid) {
         r=grid.length;
         c=grid[0].length;
       // boolean[][] visited=new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }  
        }
        return count;
    }
}