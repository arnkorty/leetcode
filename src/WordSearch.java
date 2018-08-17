public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(i, j, 0, word,board) == true) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    private boolean helper(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char tmp = board[i][j];
        board[i][j] = '#';

        boolean rst = helper(i + 1, j, index + 1, word, board) || helper(i, j + 1, index + 1, word, board) || helper(i, j - 1, index + 1, word, board) || helper(i - 1, j, index + 1, word, board);

        board[i][j] = tmp;
        return rst;
    }
    public static void main(String[] args) {

    }
}
