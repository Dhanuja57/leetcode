public class Solution {
    public String countAndSay(int n) {
        // Base case
        if (n == 1) {
            return "1";
        }
        
        // Start from the first term
        String curr = "1";
        
        // Build terms 2 through n
        for (int term = 2; term <= n; term++) {
            StringBuilder next = new StringBuilder();
            int j = 0; 
            int len = curr.length();
            
            // Scan through the current string
            while (j < len) {
                char c = curr.charAt(j);
                int count = 0;
                
                // Count how many times c repeats consecutively
                while (j < len && curr.charAt(j) == c) {
                    count++;
                    j++;
                }
                
                // Append "<count><digit>" to next
                next.append(count).append(c);
            }
            
            // Prepare for the next iteration
            curr = next.toString();
        }
        
        return curr;
    }
}
