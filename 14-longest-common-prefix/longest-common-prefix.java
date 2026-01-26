class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=0;
        if(strs.length==0) return "";
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
         String e1=strs[0];
        String e2=strs[strs.length-1] ;
        for(int i=0;i<Math.min(e1.length(),e2.length());i++){
            if(e1.charAt(i)!=e2.charAt(i)) return sb.toString();
            sb.append(e1.charAt(i));
        }
        return sb.toString();
    }
}