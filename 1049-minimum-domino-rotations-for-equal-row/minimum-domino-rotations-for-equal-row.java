class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // Try to make all elements in tops or bottoms equal to either tops[0] or bottoms[0]
        // Because only those two values could potentially appear in every domino
        int rotations = check(tops[0], tops, bottoms);
        
        // If possible to make all values same as tops[0]
        if (rotations != -1) return rotations;
        
        // Else try with bottoms[0] only if it's different from tops[0] (to avoid duplicate check)
        if (tops[0] != bottoms[0]) {
            return check(bottoms[0], tops, bottoms);
        }
        
        // If both fail, return -1
        return -1;
    }

    // Helper function to check if we can make all values equal to 'target'
    private int check(int target, int[] tops, int[] bottoms) {
        int rotationTop = 0;     // Rotations needed to make all tops equal to target
        int rotationBottom = 0;  // Rotations needed to make all bottoms equal to target

        for (int i = 0; i < tops.length; i++) {
            // If neither top nor bottom at i has the target, it's impossible
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            }
            // If top[i] is not the target, we need to rotate it from bottom[i]
            else if (tops[i] != target) {
                rotationTop++;
            }
            // If bottom[i] is not the target, we need to rotate it from top[i]
            else if (bottoms[i] != target) {
                rotationBottom++;
            }
        }
        
        // Return the minimum number of rotations needed
        return Math.min(rotationTop, rotationBottom);
    }
}
