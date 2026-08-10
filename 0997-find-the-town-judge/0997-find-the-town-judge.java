class Solution {
    public int findJudge(int n, int[][] trust) {

        // int[] indegree = new int[n + 1];
        // int[] outdegree = new int[n + 1];

        // for (int i = 0; i < trust.length; i++) {
        //     int u = trust[i][0];
        //     int v = trust[i][1];

        //     outdegree[u]++;
        //     indegree[v]++;
        // }

        // for (int i = 1; i <= n; i++)
        //     if (indegree[i] == n - 1 && outdegree[i] == 0)
        //         return i;

        // return -1;

        int[] score = new int[n + 1];
        for (int[] t : trust) {
            score[t[0]]--;
            score[t[1]]++;
        }

        for (int i = 1; i <= n; i++)
            if (score[i] == n - 1)
                return i;

        return -1;
    }
}