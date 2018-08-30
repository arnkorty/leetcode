import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        int len = nums.length;
        int max = nums[0], min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int gap = (int)Math.ceil((double)(max - min) / (len - 1));

        int[] BucketsMIN = new int[len - 1];
        int[] BucketsMAX = new int[len - 1];
        Arrays.fill(BucketsMIN, Integer.MAX_VALUE);
        Arrays.fill(BucketsMAX, Integer.MIN_VALUE);
        for (int num : nums) {
            if (num == min || num == max) continue;

            int bucket = (num - min) / gap;
            BucketsMIN[bucket] = Math.min(BucketsMIN[bucket], num);
            BucketsMAX[bucket] = Math.max(BucketsMAX[bucket], num);
        }

        int result = 0;
        int previous = min;
        for (int i = 0; i < len - 1; i++) {
            if (BucketsMIN[i] == Integer.MAX_VALUE && BucketsMAX[i] == Integer.MIN_VALUE) {
                continue;
            }
            result = Math.max(result, BucketsMIN[i] - previous);
            previous = BucketsMAX[i];
        }
        result = Math.max(result, max - previous);
        return result;
    }
    public static void main(String[] args) {

    }
}
