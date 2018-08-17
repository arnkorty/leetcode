public class ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSubTreeLessThan(root.left, root.val) && isSubTreeGreaterThan(root.right, root.val) && isValidBST(root.left) && isValidBST(root.right);
    }

    public boolean isSubTreeLessThan(TreeNode node, int val){
        if(node == null){
            return true;
        }
        return node.val < val && isSubTreeLessThan(node.left, val) && isSubTreeLessThan(node.right, val);
    }

    public boolean isSubTreeGreaterThan(TreeNode node, int val){
        if(node == null){
            return true;
        }
        return node.val > val && isSubTreeGreaterThan(node.left, val) && isSubTreeGreaterThan(node.right, val);
    }

    public static void main(String[] args) {

    }
}
