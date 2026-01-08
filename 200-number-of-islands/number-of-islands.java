class Solution {
    static int r;
    static int c;
    public void dfs(char grid[][],int i,int j,boolean visited[][]){
        if(i<0|| i>=r||j<0||j>=c || visited[i][j]==true){
            return;
        }

       if(grid[i][j]=='1' ){
         visited[i][j]=true;
       dfs(grid,i-1,j,visited);
       dfs(grid,i+1,j,visited);
       dfs(grid,i,j-1,visited);
       dfs(grid,i,j+1,visited);
       }

    }
    public int numIslands(char[][] grid) {
         r=grid.length;
         c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    count++;
                    dfs(grid,i,j,visited);
                }
            }

            
        }
        return count;
    }
}