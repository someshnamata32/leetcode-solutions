class Solution {

    boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {

                    for (char ch = '1'; ch <= '9'; ch++) {

                        if (isSafe(board, i, j, ch)) {
                            board[i][j] = ch;

                            if (solve(board))
                                return true;

                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char ch) {
        //row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch)
                return false;
        }

        //col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch)
                return false;
        }

        //sun-boxes
        int nexRow = row - row % 3;
        int newCol = col - col % 3;

        for (int i = nexRow; i < nexRow + 3; i++) {
            for (int j = newCol; j < newCol + 3; j++) {
                if (board[i][j] == ch)
                    return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}