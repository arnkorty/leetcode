import java.util.ArrayList;

public class BinaryTreePostorderTraversal {
    public void helper(TreeNode root, ArrayList<Integer> re){
        if(root==null)
            return;

        helper(root.left,re);
        helper(root.right,re);
        re.add(root.val);
    }
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        if(root==null)
            return re;
        helper(root,re);
        return re;
    }
    public static void main(String[] args) {

    }
}
