public class PopulatingNextRightPointersInEachNodeII {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }

        TreeLinkNode rootnext = root.next;
        TreeLinkNode next = null;
        while(rootnext != null){
            if(rootnext.left != null){
                next = rootnext.left;
                break;
            }else if(rootnext.right != null){
                next = rootnext.right;
                break;
            }else{
                rootnext = rootnext.next;
            }
        }

        if(root.right != null){
            root.right.next = next;
        }
        if(root.left != null){
            if(root.right != null){
                root.left.next = root.right;
            }else{
                root.left.next = next;
            }
        }

        connect(root.right);
        connect(root.left);
    }

    public static void main(String[] args) {

    }
}
