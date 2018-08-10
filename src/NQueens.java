import java.util.*;
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if(n<=0)
            return res;

        int [] columnVal = new int[n];

        DFS_helper(n,res,0,columnVal);
        return res;
    }

    public void DFS_helper(int nQueens, List<List<String>> res, int row, int[] columnVal){
        if(row == nQueens){
            List<String> unit = new ArrayList<>();
            for(int i = 0; i < nQueens; i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < nQueens; j++){
                    if(j == columnVal[i])
                        s.append("Q");
                    else
                        s.append(".");
                }

                unit.add(s.toString());
            }

            res.add(unit);
        }else{
            for(int i = 0; i < nQueens; i++){
                columnVal[row] = i;//(row,columnVal[row)==>(row,i)

                if(isValid(row,columnVal))
                    DFS_helper(nQueens, res, row+1, columnVal);
            }
        }
    }

    public boolean isValid(int row, int [] columnVal){
        for(int i = 0; i < row; i++){
            if(columnVal[row] == columnVal[i]
                    ||Math.abs(columnVal[row]-columnVal[i]) == row-i)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
