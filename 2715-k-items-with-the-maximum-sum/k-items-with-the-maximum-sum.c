int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
    int nums[50];
    int n0=numOnes;
    int nz= numZeros;
    int nn=numNegOnes;
    int count=0;
    int sum=0;
    while(1){
        while(n0){
            sum+=1;
            count++;
            if(count==k) 
              return sum;
             n0--;
        }
         while(nz){
            sum+=0;
            count++;
            if(count==k) 
               return sum;
            nz--;
        }
         while(nn){
            sum+=-1;
            count++;
            if(count==k) 
                return sum;
            nn--;
        }
       return 0; 
    }
}