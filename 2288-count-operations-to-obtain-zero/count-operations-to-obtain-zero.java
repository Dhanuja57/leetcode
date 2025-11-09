class Solution {
    public int countOperations(int num1, int num2) {
        boolean flag=true;
        int res=0;
        while(flag){
            if(num1==0 || num2==0) {flag=false;
               break;}
            if(num1>=num2) {
                 num1=num1-num2;
                 res++;
            }
            else{
                num2=num2-num1;
                res++;
            }

        }
        return res;
    }
}