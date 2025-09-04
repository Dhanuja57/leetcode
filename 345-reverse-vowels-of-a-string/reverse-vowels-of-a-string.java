class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length -1;
        while(i<j){
            if(!isvow(arr[i])){
                i++;
            }
            else if(!isvow(arr[j])){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
         return new String(arr);

    }
    private boolean isvow(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}