//https://leetcode.com/problems/sudoku-solver/


class SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board){
            for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch ='1';ch<='9';ch++){
                        if(isValid(board,i,j,ch)){
                            board[i][j] = ch;
                            if(solve(board))return true;
                            else board[i][j] = '.';
                            
                        }
                    }
                     return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int rows, int cols, char ch){
        for(int i=0;i<9;i++){
            if(board[rows][i]==ch)return false;
            if(board[i][cols]==ch)return false;
            if(board[3 * (rows / 3) + i / 3][3 * (cols / 3) + i % 3] == ch)return false;
        }
        return true;
    }
}
