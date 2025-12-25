class Solution {
    int value(char c){
            if (c=='I') return 1;
            if(c=='V') return 5;
            if(c=='X') return 10;
            if(c=='L') return 50;
            if(c=='C') return 100;
            if(c=='D') return 500;
            return 1000;
        }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int cur=value(s.charAt(i));
            if(i+1<s.length() && cur<value(s.charAt(i+1))){
                sum-=cur;
            }
            else{
                sum+=cur;
            }
        }
        return sum;
    }
}