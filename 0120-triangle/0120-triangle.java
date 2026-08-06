class Solution {
    // int solve(List<List<Integer>> triangle, int row, int col) {
    //     if (row == triangle.size() - 1)
    //         return triangle.get(row).get(col);

    //     int down = solve(triangle, row + 1, col);
    //     int diagonal = solve(triangle, row + 1, col + 1);
    //     return triangle.get(row).get(col) + Math.min(down, diagonal);
    // }

    // public int minimumTotal(List<List<Integer>> triangle) {
    //     return solve(triangle, 0, 0);
    // }

    Integer[][] dp;

    int solve(List<List<Integer>> triangle, int row, int col) {

        if (row == triangle.size() - 1)
            return triangle.get(row).get(col);

        if (dp[row][col] != null)
            return dp[row][col];

        int down = solve(triangle, row + 1, col);
        int diagonal = solve(triangle, row + 1, col + 1);
        return dp[row][col] = triangle.get(row).get(col) + Math.min(down, diagonal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];

        return solve(triangle, 0, 0);
    }
}