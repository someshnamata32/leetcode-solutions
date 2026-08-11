class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] score = new long[n];

        for (int i = 0; i < n; i++) {
            int val = edges[i];
            score[val] += i;
        }
        
        long max = -1;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
                ans = i;
            }
        }
        return ans;
    }
}