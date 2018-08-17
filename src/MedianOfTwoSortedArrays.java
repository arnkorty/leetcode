class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      if (nums1 == null || nums2 == null) return 0.0;
      int m = nums1.length, n = nums2.length;
      if (m == 0 &&n == 0) return 0.0;
      int l = (m + n + 1) / 2;
      int r = (m + n + 2) / 2;
      if (l == r) return findKthElement(nums1, nums2, 0, 0, l);
      return (findKthElement(nums1, nums2, 0, 0, l) + findKthElement(nums1, nums2, 0, 0, r)) / 2.0;
  }
  
  public int findKthElement(int[] A, int[] B, int aStart, int bStart, int k) {
      if (aStart >= A.length) return B[bStart + k - 1];
      if (bStart >= B.length) return A[aStart + k - 1];
      if (k == 1) return Math.min(A[aStart], B[bStart]);
      
      int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
      if (aStart + k / 2 - 1 < A.length) aMid = A[aStart + k / 2 - 1];
      if (bStart + k / 2 - 1 < B.length) bMid = B[bStart + k / 2 - 1];
      
      if (aMid < bMid) {
          return findKthElement(A, B, aStart + k / 2, bStart, k - k / 2);
      }
      
      return findKthElement(A, B, aStart, bStart + k / 2, k - k / 2);
  }
    public static void main(String[] args) {

    }
}
