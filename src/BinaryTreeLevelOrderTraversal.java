import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }

        List<Integer> levelStorage = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (queue.size() > 1) {
            TreeNode top = queue.poll();
            if (top == null) {
                resultList.add(levelStorage);
                queue.offer(null);
                levelStorage = new LinkedList<>();
            } else {
                levelStorage.add(top.val);
                if (top.left != null) {
                    queue.offer(top.left);
                }
                if (top.right != null) {
                    queue.offer(top.right);
                }
            }
        }
        resultList.add(levelStorage);

        return resultList;
    }

    public static void main(String[] args) {
    }
}
