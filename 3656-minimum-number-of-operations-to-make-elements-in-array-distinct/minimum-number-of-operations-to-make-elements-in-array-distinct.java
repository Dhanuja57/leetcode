class Solution {
    public int minimumOperations(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }

        int op=0;

        while(true){
            Set<Integer>set=new HashSet<>(list);
            if(set.size()== list.size()){
                break;
            }
            op++;
            for(int i=0;i<3 && !list.isEmpty();i++){
                list.remove(0);
            }
        }
        return op;
    }
}