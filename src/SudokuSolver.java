public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        canSolveSudoku(board);
    }

    private boolean canSolveSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isCurrentBoardValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (canSolveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';       // backtracking
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isCurrentBoardValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == c) {
                return false;
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j] == c) {
                return false;
            }
        }

        for (int i = row / 3 * 3; i < row / 3 * 3 + 3; i++) {
            for (int j = col / 3 * 3; j < col /3 * 3 + 3; j++) {
                if (board[i][j] == c) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
