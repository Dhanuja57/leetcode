class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0'); // build number
            } 
            else if (c == '[') {
                num.push(n);
                n = 0;
                str.push(sb);
                sb = new StringBuilder();
            } 
            else if (c == ']') {
                int k = num.pop();
                StringBuilder temp = sb;
                sb = str.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } 
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}