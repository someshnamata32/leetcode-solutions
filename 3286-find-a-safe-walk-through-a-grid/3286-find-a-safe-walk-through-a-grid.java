class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] dist = new int[m][n];

        for (int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        Queue<int[]> q = new LinkedList<>();

        dist[0][0] = grid.get(0).get(0);
        q.offer(new int[] { 0, 0 });

        int[] dir = { -1, 0, 1, 0, -1 };

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i];
                int ny = y + dir[i + 1];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int newCost = dist[x][y] + grid.get(nx).get(ny);
                    if (newCost < dist[nx][ny]) {
                        dist[nx][ny] = newCost;
                        q.offer(new int[] { nx, ny });
                    }
                }
            }
        }
        return dist[m - 1][n - 1] < health;
    }
}