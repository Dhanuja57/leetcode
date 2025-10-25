class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int split=n/7;
        int count =0;
        for(int i=1;i<=split;i++){
            count=i;
            for(int d=0;d<7;d++){
                sum=sum+count;
                count++;
            }
        }
        int m=n%7;
        int c=split+1;
        for(int j=0;j<m;j++){
            sum=sum+c;
            c++;
         }
    return sum;
    }
}