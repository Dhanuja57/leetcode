class Solution {
    private int ans(int[] h){
        Stack<Integer> s=new Stack<>();
        int max=0;
        int h_len=h.length;
        for(int i=0;i<= h_len;i++){
            int ch=(i== h_len)?0:h[i];
            while(!s.isEmpty() && ch<h[s.peek()]){
                int height=h[s.pop()];
                int width=((s.isEmpty())?i:i-s.peek()-1);
                max=Math.max(max,(height*width));
            }
            s.push(i);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int row=matrix.length;
        int col=matrix[0].length;
        int max=0;
        int[] height=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1')
                    height[j]+=1;
                else 
                   height[j]=0;
            }
            max=Math.max(max,ans(height));
        }
        return max;
    }
}