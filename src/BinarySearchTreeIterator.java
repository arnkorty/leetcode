import java.util.Stack;

public class BinarySearchTreeIterator {
    Stack<TreeNode> nodePath = new Stack<>();
    public BinarySearchTreeIterator(TreeNode root) {
        while(!nodePath.isEmpty())
            nodePath.clear();
        TreeNode n1 = root;
        while(n1!=null){
            nodePath.add(n1);
            n1 = n1.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !nodePath.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode n1 = nodePath.pop();
        int res = n1.val;
        n1 = n1.right;
        while(n1!=null){
            nodePath.push(n1);
            n1 = n1.left;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
