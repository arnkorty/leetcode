import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        helper(result, list, s);
        return result;
    }
    private void helper(List<List<String>> result, List<String> list, String s) {
        if (s.length() == 0) {
            result.add(new ArrayList<String>(list));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (!isPalindrome(s.substring(0,i))) {
                continue;
            }
            list.add(s.substring(0, i));
            helper(result, list, s.substring(i));
            list.remove(list.size() - 1);
        }
    }
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

    }

}

