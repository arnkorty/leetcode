import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();

            if (node == null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                // add the rightest to the answer
                if (queue.peek() == null) {
                    ans.add(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
