public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int totalPath = m + n - 2;
        int down = m-1;
        int right = n-1;
        if(down == 0 || right==0){
            return 1;
        }
        int count = Math.min(down, right);
        long result = 1;
        for(int i = 1 ; i<=count ; i++){
            result *= totalPath--;
            result /= i;
        }
        return (int) result;
    }
    public static void main(String[] args) {

    }
}
