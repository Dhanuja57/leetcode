class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        for(int num:nums)  arr.add(num);
        int op=0;
        while(!sorted(arr)){
           int min=Integer.MAX_VALUE;
           int index=-1;
           for(int i=0;i<arr.size()-1;i++){
            int sum=arr.get(i)+arr.get(i+1);
            if(sum<min){
                min=sum;
                index=i;
            }
           }
           arr.set(index,arr.get(index)+arr.get(index+1));
           arr.remove(index+1);
           op++;
        }
        return op;
    }
    private static boolean sorted(List<Integer>arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1))  return false;

        }
        return true;
    }
}