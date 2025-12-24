class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < n; end++) {
            // If the character is already in the set, move the start pointer to the right of the repeated character
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            // Add the current character to the set
            set.add(s.charAt(end));
            // Update the maximum length of the substring without repeating characters
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}