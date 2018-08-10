import java.util.*;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return res;
        int rowNum = matrix.length, colNum = matrix[0].length;
        int left = 0, right = colNum - 1, top = 0, bot = rowNum - 1;

        while(res.size() < rowNum * colNum) {
            for(int col = left; col <= right; col++)
                res.add(matrix[top][col]);
            top++;
            if(res.size() < rowNum * colNum) {
                for(int row = top; row <= bot; row++)
                    res.add(matrix[row][right]);
                right--;
            }
            if(res.size() < rowNum * colNum) {
                for(int col = right; col >= left; col--)
                    res.add(matrix[bot][col]);
                bot--;
            }
            if(res.size() < rowNum * colNum) {
                for(int row = bot; row >= top; row--)
                    res.add(matrix[row][left]);
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
