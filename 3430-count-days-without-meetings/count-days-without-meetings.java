class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])); // Sort meetings by start day
        
        int meetingDays = 0;
        int prevEnd = 0; // Last occupied day

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            if (start > prevEnd + 1) {  
                // If there is a gap, count only new meeting days
                meetingDays += (end - start + 1);
            } else {
                // Merge overlapping meetings
                meetingDays += Math.max(0, end - prevEnd);
            }

            prevEnd = Math.max(prevEnd, end); // Update the last occupied day
        }

        return days - meetingDays; // Compute available (free) days
    }
}