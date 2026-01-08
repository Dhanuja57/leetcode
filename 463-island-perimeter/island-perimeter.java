class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(j-1<0||grid[i][j-1]==0){
                        count++;
                    }
                     
                    if(i-1<0||grid[i-1][j]==0){
                        count++;
                    }
                   
                    if(j+1>=c||grid[i][j+1]==0){
                        count++;
                    }

                     if(i+1>=r||grid[i+1][j]==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}