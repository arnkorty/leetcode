import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row=triangle.size();
        if(row==0) return 0;

        int[] res=new int[row+1];

        for(int i=row-1;i>=0;i--){
            List<Integer> list=triangle.get(i);
            for(int j=0;j<list.size();j++){
                res[j]=(Math.min(res[j+1],res[j])+list.get(j));
            }
        }

        return res[0];
    }
    public static void main(String[] args) {

    }
}
