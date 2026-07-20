class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> gr = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int ii = 0;
        
        while(ii < k){
            int[][] grid2 = new int[m][n];
            grid2[0][0] = grid[m-1][n-1];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(j != n-1) grid2[i][j+1] = grid[i][j];
                    if(i != m-1) grid2[i+1][0] =  grid[i][n-1];
                }
            }
            grid = grid2;
            ii++;
        }
        // for(int i = 0; i < m; i++){
        //     gr.add(new ArrayList<>());
        // }
        for(int i = 0; i < m; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++){
                row.add(grid[i][j]);
            }
            gr.add(row);
        }
        return gr;
    }
}