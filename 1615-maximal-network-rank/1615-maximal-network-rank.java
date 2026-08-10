class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {

        int[] degree = new int[n];
        boolean[][] connected = new boolean[n][n];
        int maxRank = 0;

        for (int i = 0; i < roads.length; i++) {

            int u = roads[i][0];
            int v = roads[i][1];

            degree[u]++;
            degree[v]++;

            connected[u][v] = true;
            connected[v][u] = true;

        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int rank = degree[i] + degree[j];

                if (connected[i][j])
                    rank--;

                maxRank = Math.max(maxRank, rank);
            }
        }
        return maxRank;
    }
}