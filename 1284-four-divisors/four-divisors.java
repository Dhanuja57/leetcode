class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        int ans=0;
        int count=0;
        for(int e: nums){
             sum=0;
            count=0;
            for(int i=1;i*i<=e;i++){
                if(e%i==0){
                   int d1=i;
                   int d2=e/i;
                   if(d1==d2){
                    count++;
                    sum+=d2;
                   }
                   else{
                    count+=2;
                    sum+=d1+d2;
                   }
                }
                if(count>4) break;
            }
    
            if(count==4)  ans+=sum;
        }
        return ans;
    }
}