public class ConvertSortedListToBinarySearchTree {
    private ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) {
            return null;
        }
        int size = 0;
        node = head;
        ListNode cur = head;
        while(cur != null) {
            cur = cur.next;
            size++;
        }
        return constructTree(0, size - 1);
    }

    private TreeNode constructTree(int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode left = constructTree(start, mid - 1);
        TreeNode root = new TreeNode(node.val);
        root.left = left;
        node = node.next;
        root.right = constructTree(mid + 1, end);
        return root;
    }
    public static void main(String[] args) {
    }
}
