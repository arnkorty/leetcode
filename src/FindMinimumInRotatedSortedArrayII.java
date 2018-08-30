public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }

        int l = 0;
        int r = num.length - 1;

        while (l < r - 1) {
            int mid = l + (r - l) / 2;

            if (num[l] < num[r]) {
                return num[l];
            }

            if (num[mid] < num[r]) {
                r = mid;
            } else if (num[mid] > num[l]) {
                l = mid;
            } else {
                l++;
            }
        }

        return Math.min(num[l], num[r]);
    }
    public static void main(String[] args) {

    }
}
