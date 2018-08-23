import java.util.HashMap;
import java.util.Stack;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode build2(int[] preorder, int[] inorder, int preIndex,
                           int startInIndex, int endInIndex) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = null;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < preorder.length; i++) {
            int temp = map.get(preorder[i]);
            TreeNode node = new TreeNode(preorder[i]);
            if (stack.isEmpty()) {
                root = node;
//              stack.add(node);
                p = root;
            } else {
                if (temp < map.get(stack.peek().val)) {
                    p.left = node;
                    p = p.left;
                } else {
                    while (!stack.isEmpty() && temp > map.get(stack.peek().val)) {
                        p = stack.pop();
                    }
                    p.right = node;
                    p = p.right;
                }
            }
            stack.add(node);
        }

        return root;
    }
    public static void main(String[] args) {
    }
}
