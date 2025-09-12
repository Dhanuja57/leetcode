class Solution {
    public String sortVowels(String s) {
        String vow="AEIOUaeiou";
        List<Character>vowels=new ArrayList<>();
        for(char c: s.toCharArray()){
            if(vow.indexOf(c)!=-1){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        int index=0;
        StringBuilder res=new StringBuilder();
        for(char c: s.toCharArray()){
            if(vow.indexOf(c)!=-1){
                res.append(vowels.get(index++));
            }
            else{
                res.append(c);
            }
        }
    
    return res.toString();
    }
}