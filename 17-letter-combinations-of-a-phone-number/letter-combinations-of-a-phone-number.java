class Solution {
    public void backtrack(String digits,int index,List<String>ans,StringBuilder res,Map<Character,String> map){
        if(index==digits.length()){
            ans.add(res.toString());
            return;
        }
       //int dig =digits.charAt(index);
        String letters=map.get(digits.charAt(index));
        for(char letter:letters.toCharArray()){
            res.append(letter);
             backtrack(digits,index+1,ans,res,map);
             res.deleteCharAt(res.length()-1);

        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits==null || digits.length()==0) return ans;
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(digits,0,ans,new StringBuilder(),map);
        return ans;
    }
}