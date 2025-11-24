class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer=new ArrayList<>();
        int val=0;
        for(int x : nums){
          val=((val*2)+x)%5;
          answer.add(val==0);
        }
        return answer;
    }
}