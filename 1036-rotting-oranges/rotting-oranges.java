class Solution {
    static int row;
    static int col;
    static int bfs(int[][] grid, Queue<int[]> queue){
        int[] arr = new int[3];
        while(!queue.isEmpty()){
           
            arr = queue.poll();
            
            
            if(arr[0] -1 >= 0  &&  grid[arr[0]-1][arr[1]]==1 ){
                    grid[arr[0]-1][arr[1]]=2;
                    queue.add(new int[] {arr[0]-1,arr[1],arr[2]+1});
            }
            if(arr[0]+1 < row &&  grid[arr[0]+1][arr[1]]==1 ){
                    grid[arr[0]+1][arr[1]]=2;
                    queue.add(new int[] {arr[0]+1,arr[1],arr[2]+1});
            }
            if(arr[1] -1 >= 0 &&  grid[arr[0]][arr[1]-1]==1 ){
                grid[arr[0]][arr[1]-1]=2;
                queue.add(new int[] {arr[0],arr[1]-1,arr[2]+1});
            }
            if(arr[1]+1 < col &&  grid[arr[0]][arr[1]+1]==1 ){
                    grid[arr[0]][arr[1]+1]=2;
                    queue.add(new int[] {arr[0],arr[1]+1,arr[2]+1});
            }
            
        }
        return arr[2];
    }

    public int orangesRotting(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        Queue<int[] > queue = new LinkedList<>();
        for(int i=0; i<row; i++ ){
            for(int j =0; j< col; j++){
                if(grid[i][j]==2){
                    int[] arr = {i,j,0}; 
                    queue.add(arr);
                  
                }
            }
        }
        int max = bfs(grid,queue);

        for(int i=0; i<row; i++ ){
            for(int j =0; j< col; j++){
                if(grid[i][j]==1){
                    return -1;
                   
                }
            }
        }         
        return max;
    }
}