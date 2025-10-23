class Solution {
    public boolean hasSameDigits(String s) {
        int [] arr=s.chars().map(c->c-'0').toArray();
        int n=arr.length;
        while (n > 2) {
            int[] temp = new int[n - 1]; 
            for (int i = 0; i < n - 1; i++) {
                temp[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = temp;
            n = arr.length; 
        }

        if(arr[0]==arr[1])  return true;
        return false;
    }
}