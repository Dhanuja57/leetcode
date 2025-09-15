class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        for(String str : text.split(" ")){
            boolean type=true;
           for(char ch : str.toCharArray()){
            if(brokenLetters.indexOf(ch)!=-1){
                type=false;
                break;
            }
        }
        if(type){
            count++;
        }
            
        }
        return count;
    }
}