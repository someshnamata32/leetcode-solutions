class Solution {
    int count = 0;
    String ans = "";

    void solve(int n, int k, boolean[] used, StringBuilder path) {
        if (path.length() == n) {
            count++;
            if (count == k) {
                ans = path.toString();
            }
            return;
        }

        for (int i = 1; i <= n; i++) {

            if (used[i])
                continue;

            used[i] = true;
            path.append(i);

            solve(n, k, used, path);

            if (!ans.isEmpty())
                return;
            path.deleteCharAt(path.length() - 1);
            used[i] = false;
        }
    }

    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n+1];
        StringBuilder path = new StringBuilder();
        solve(n, k, used, path);
        return ans;
    }
}