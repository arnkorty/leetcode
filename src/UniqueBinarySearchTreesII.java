import java.util.*;
public class UniqueBinarySearchTreesII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<TreeNode> generateTrees(int n) {
        if(n < 1)
            return new ArrayList<TreeNode>();
        return helper(1, n);
    }
    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> res = new ArrayList();
        if(start > end) {
            res.add(null);
            return res;
        }
        for(int i = start; i <= end; i ++) {
            List<TreeNode> leftChild = helper(start, i - 1);
            List<TreeNode> rightChild = helper(i + 1, end);
            for(TreeNode left : leftChild) {
                for(TreeNode right : rightChild) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
