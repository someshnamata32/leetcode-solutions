class Solution {
    public void setZeroes(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
       int[] m = new int[row];
       int[] n = new int[col];
       for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
          if(matrix[i][j] == 0){
            m[i] = -1;
            n[j] = -1;
          }
        }
       }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(m[i]==-1||n[j]==-1)
                    matrix[i][j]=0;
            }
        }
       
        }
    }
