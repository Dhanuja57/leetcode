class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k==5 || k%5==0) return -1;
        if(k==2 || k%2==0) return -1;
        if(k==1) return 1;
        int count=1;
        int val=1;
        while(true){
            if(val==0) {
                return count;}
            val=((val*10)+1)%k;
            count++;
        }
    }
}