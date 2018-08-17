public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if(n == 0||n == 1)
            return 1;

        int[] C = new int[n+1];
        C[0] = 1;

        for(int num=1;num<=n;num++){
            for(int i=0;i<=num-1;i++){
                C[num] += C[i]*C[(num-1)-i];
            }
        }
        return C[n];
    }
    public static void main(String[] args) {

    }
}
