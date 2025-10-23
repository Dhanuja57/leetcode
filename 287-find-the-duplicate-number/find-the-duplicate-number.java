class Solution {
    public int findDuplicate(int[] nums) {
        Set <Integer> l=new HashSet<>();
        for(int n : nums){
            if(l.contains(n)) return n;
            l.add(n);
        }
        return -1;
    }
}