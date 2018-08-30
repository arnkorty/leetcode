public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int prevMin = nums[0], prevMax = nums[0];
        int curMin, curMax;
        for (int i = 1; i < nums.length; ++i) {
            curMin = Math.min(Math.min(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            curMax = Math.max(Math.max(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            prevMin = curMin;
            prevMax = curMax;
            max = Math.max(curMax, max);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
