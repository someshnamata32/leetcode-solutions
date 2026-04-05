class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int up = (i>0) ? mat[i-1][j] : -1;
                int down = (i<r-1) ? mat[i+1][j] : -1;
                int left = (j>0) ? mat[i][j-1] : -1;
                int right = (j<c-1) ? mat[i][j+1] : -1;
                
                if(mat[i][j] > up &&
                mat[i][j] > down && mat[i][j] > left && mat[i][j] > right)
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}