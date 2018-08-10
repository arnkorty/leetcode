public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int length = board.length;
        if(length == 0)
            return true;

        for(int i = 0;i < length;i++){
            boolean[] row_numbers = new boolean[10];
            boolean[] column_numbers = new boolean[10];
            for(int j = 0;j < length;j++){
                if(board[i][j]!= '.' ){
                    if(row_numbers[board[i][j] - '0'])
                        return false;
                    row_numbers[board[i][j]-'0'] = true;
                }

                if(board[j][i]!= '.'){
                    if(column_numbers[board[j][i]-'0'])
                        return false;
                    column_numbers[board[j][i]-'0'] = true;
                }
            }
        }

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                boolean[] numbers = new boolean[10];
                for(int row = 3*i;row < 3*i+3;row++){
                    for(int column = 3*j;column < 3*j+3;column++){
                        if(board[row][column] != '.'){
                            if(numbers[board[row][column]-'0'])
                                return false;
                            numbers[board[row][column]-'0'] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
