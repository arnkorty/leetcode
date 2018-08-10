class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
     int start = 0, end = 0;
     for (int i = 0; i < s.length(); i++) {
         int len1 = this.expandBy(s, i, i);
         int len2 = this.expandBy(s, i, i + 1);
         int len = Math.max(len1, len2);
         if (len > end - start) {
             start = i - (len - 1) / 2;
             end = i + len / 2;
         }
     }
     return s.substring(start, end + 1);
 }

 private int expandBy(String s, int l, int r) {
     int L = l, R = r;
     while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
         L--;
         R++;
     }
     return R - L - 1;
 }
}
