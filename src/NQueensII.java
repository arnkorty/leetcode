public class NQueensII {
    int count = 0;
    public int totalNQueens(int n) {
        boolean[] b1 = new boolean[n];         //第i列是否放置皇后
        boolean[] b2 = new boolean[2*n-1];     //第i条斜线（左上到右下）是否放置皇后
        boolean[] b3 = new boolean[2*n-1];     //第i条斜线（左下到右上）是否放置皇后

        fon(0,b1,b2,b3,n);
        return count;
    }
    public void fon(int row, boolean[] b1, boolean[] b2, boolean[] b3 , int n){
        if(row == n) {
            count++;
            return;
        }
        for(int i=0;i<n;i++){
            int x1 = row+i;
            int x2 = row-i+n-1;
            if(b1[i] || b2[x1] || b3[x2])    //判断第row行，第i列是否可以放置皇后
                continue;
            b1[i] = true;  b2[x1] = true;  b3[x2] = true;
            fon(row+1,b1,b2,b3,n);
            b1[i] = false;  b2[x1] = false;  b3[x2] = false;
        }

    }

    public static void main(String[] args) {

    }
}
