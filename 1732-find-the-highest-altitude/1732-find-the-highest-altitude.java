class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int curr = 0;

        for (int n : gain) {
            curr += n;
            max = Math.max(curr, max);
        }
        return max;
    }
}