class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{entrance[0],entrance[1],0});
        maze[entrance[0]][entrance[1]] = '+';

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!queue.isEmpty()){

            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int dist = curr[2];

            for(int[] d : dir){

                int newR = row + d[0];
                int newC = col + d[1];

                if(newR >= 0 && newR < m && newC >= 0 && newC < n && maze[newR][newC] == '.'){
                    if(newR == 0 || newR == m-1 || newC == 0 || newC == n-1)
                    return dist+1;
                
                    maze[newR][newC] = '+';
                    queue.add(new int[]{newR,newC,dist+1});
                }
            }
        }
        return -1;
    }
}