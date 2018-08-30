import java.util.Arrays;

public class BestTimeToBuyAndSellStockIV {

    public int maxProfit(int k, int[] prices) {
        if (k < 1 || prices == null || prices.length < 2) return 0;
        if (k >= prices.length/2) {
            int max = 0;
            for(int i=1; i<prices.length; i++) max += Math.max(0, prices[i]-prices[i-1]);
            return max;
        }
        int[] buy = new int[k];
        int[] sell = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        for(int i=0; i<prices.length; i++) {
            for(int j=0; j<k; j++) {
                buy[j] = Math.max(buy[j], j==0?-prices[i]:sell[j-1]-prices[i]);
                sell[j] = Math.max(sell[j], buy[j]+prices[i]);
            }
        }
        return sell[k-1];
    }
    public static void main(String[] args) {

    }
}
