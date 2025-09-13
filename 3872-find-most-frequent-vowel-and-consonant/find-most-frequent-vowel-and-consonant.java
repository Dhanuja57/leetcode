class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        String vow = "aeiou";
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int vcount = 0;  
        int ccount = 0;
            for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                if (vow.indexOf(ch) != -1) {
                    vcount = Math.max(vcount, freq[i]);
                } else {
                    ccount = Math.max(ccount, freq[i]);
                }
            }
        }

        return vcount + ccount;
    }
}
