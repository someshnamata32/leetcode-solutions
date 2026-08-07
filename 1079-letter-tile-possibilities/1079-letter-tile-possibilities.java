class Solution {
    int ans = 0;

    void solve(int[] freq) {
        for (int i = 0; i < freq.length; i++) {
            
            if (freq[i] == 0)
                continue;

            freq[i]--;
            ans++;

            solve(freq);
            freq[i]++;
        }
    }

    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for(char ch : tiles.toCharArray())
            freq[ch - 'A']++;

        solve(freq);
        return ans;
    }
}