class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
        List <Integer> r1=new ArrayList<>();
        List <Integer> r2=new ArrayList<>();
        for(int x: nums){
           sum+=x;
           if(x%3 ==1) r1.add(x);
           if(x%3 == 2) r2.add(x);
        }
           Collections.sort(r1);
           Collections.sort(r2);

           if(sum%3==0) return sum;
           int remove=Integer.MAX_VALUE;
     if (sum % 3 == 1) {
        if (!r1.isEmpty()) remove = Math.min(remove, r1.get(0));
        if (r2.size() >= 2) remove = Math.min(remove, r2.get(0) + r2.get(1));
      }
 
    if (sum % 3 == 2) {
        if (!r2.isEmpty()) remove = Math.min(remove, r2.get(0));
        if (r1.size() >= 2) remove = Math.min(remove, r1.get(0) + r1.get(1));
    }
   return sum-remove;
    }
}