class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a;
    }

    public static int lcm(int a,int b){
        return (int)((long)a * b / gcd(a, b));
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> s=new Stack<>();
        for(int n:nums){
            s.push(n);
            while(s.size()>1){
              int cur=s.pop();
              int prev=s.pop();
              if(gcd(cur,prev)>1){
                int modifi=lcm(cur,prev);
                s.push(modifi);
              }
              else{
                s.push(prev);
                s.push(cur);
                break;
              }
            }
            
        }
        return new ArrayList<>(s);
    }
}