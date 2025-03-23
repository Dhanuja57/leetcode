import java.util.*;

public class Solution {
    // You need to treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1;  // Extract last bit
            reversed = (reversed << 1) | lastBit; // Shift left and add bit
            n >>>= 1; // Unsigned right shift
        }

        return reversed;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 43261596; // Example: 00000010100101000001111010011100
        System.out.println(sol.reverseBits(n)); 
        // Expected Output: 964176192 (Binary: 00111001011110000010100101000000)
    }
}
