class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer>res=new HashSet<>();
        Set<Integer>curr=new HashSet<>();

        for(int num:arr){
            Set<Integer>newc=new HashSet<>();
            newc.add(num);

            for(int val: curr){
                newc.add(val | num);
            }
            curr=newc;
            res.addAll(curr);
        }
        return res.size();
    }
}