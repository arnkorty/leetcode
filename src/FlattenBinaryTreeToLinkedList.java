public class FlattenBinaryTreeToLinkedList {
    TreeNode lastvisited = null;
    public void flatten(TreeNode root) {
        if(root == null)
            return;

        TreeNode realright = root.right;
        if(lastvisited != null){
            lastvisited.left = null;
            lastvisited.right = root;
        }

        lastvisited = root;
        flatten(root.left);
        flatten(realright);
    }
    public static void main(String[] args) {
    }
}
