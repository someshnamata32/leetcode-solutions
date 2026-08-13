class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int n = grid.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1)
                    queue.add(new int[]{i,j,0});
            }
        }

        if(queue.isEmpty() || queue.size() == n*n)
            return -1;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int ans = 0;

        while(!queue.isEmpty()){
              
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int dist = curr[2];
            ans = Math.max(ans,dist);

            for(int[] d : dir){
                int newR = row + d[0];
                int newC = col + d[1];

                if(newR >= 0 && newR < n && newC >= 0 && newC < n && grid[newR][newC] == 0){

                   grid[newR][newC] = 1;
                    queue.add(new int[]{newR,newC,dist+1});
                }
            }
        }
        return ans;
    }
}