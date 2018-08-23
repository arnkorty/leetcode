public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        if(N<2)
            return 0;
        int[] left=new int[N];
        int[] right=new int[N];
        int min = prices[0];
        int max = prices[N-1];
        for(int i=1;i<N;i++){
            left[i] = Math.max(left[i-1],prices[i]-min);
            min = Math.min(min,prices[i]);

            right[N-1-i] = Math.max(right[N-i],max - prices[N-1-i]);
            max = Math.max(max,prices[N-1-i]);
        }

        int res=0;
        for(int i=0;i<N;i++)
            res = Math.max(left[i]+right[i],res);
        return res;
    }

    public static void main(String[] args) {

    }
}
