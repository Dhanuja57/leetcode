class Solution {
    public int numberOfPairs(int[][] points) {
        int res=0;
        Arrays.sort(points,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        for (int i=0;i<=points.length-2;i++){
            int d[]=points[i];
            int xmin=d[0];
            int xmax=Integer.MAX_VALUE;
            int ymin=Integer.MIN_VALUE;
            int ymax=d[1]+1;
            for(int j=i+1;j<points.length;j++){
                int d1[]=points[j];
                int x=d1[0];
                int y=d1[1];

                if (x >= xmin && x < xmax && y > ymin && y < ymax) {
                    res++;
                    xmin = x;
                    ymin = y;
                }

            }
        }
        return res;
    }
}