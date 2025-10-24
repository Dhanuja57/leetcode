class Solution {
    boolean helper(int n){
        HashMap <Integer,Integer> h=new HashMap<>();
        while(n!=0){
            h.put(n%10,h.getOrDefault(n%10,0)+1);
            n=n/10;
        }

        for(Map.Entry<Integer,Integer> m : h.entrySet()){
            if(m.getKey()!=m.getValue())  return false;
        }
            return true;
        
    }
    public int nextBeautifulNumber(int n) {
        n++;
        while(true){
        if(helper(n))  return n;
        n++;
        }

    }
}