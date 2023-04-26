//https://leetcode.com/problems/valid-sudoku/


class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char num = board[i][j];
                if(num != '.')
                    if(
                        !seen.add(num+" in row "+i) ||
                        !seen.add(num+" in col "+j) ||
                        !seen.add(num+" in block "+ i/3+"_"+j/3)
                      )
                        return false;
            }
        }
        return true;
    }
}
