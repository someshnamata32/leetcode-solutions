class Solution {

    void dfs(int row, int col, int[][] grid, Queue<int[]> queue){

        int n = grid.length;

        if(row < 0 || row >= n || col < 0 || col >= n || grid[row][col] != 1)
            return;

        grid[row][col] = 2;
        queue.add(new int[]{row,col});

        dfs(row - 1, col, grid, queue);
        dfs(row + 1, col, grid, queue);
        dfs(row, col - 1, grid, queue);
        dfs(row, col + 1, grid, queue);

    }

    public int shortestBridge(int[][] grid) {
        
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        boolean found = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    dfs(i, j, grid, queue);
                    found = true;
                    break;
                }
            }
            if(found)
            break;
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        int distance = 0;

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i=0; i<size; i++){

                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                for(int[] d : dir){

                    int newR = row + d[0];
                    int newC = col + d[1];

                    if(newR >= 0 && newR < n && newC >= 0 && newC < n ){

                        if(grid[newR][newC] == 1)
                            return distance;
                        
                        if(grid[newR][newC] == 0){
                            grid[newR][newC] = 2;
                            queue.add(new int[]{newR,newC});
                        }
                    }
                }
            } 
            distance++;
        }
        return -1;
    }
}