public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return head;
        RandomListNode node = head;
        while(node!=null){
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }

        node = head;
        while(node!=null){
            if(node.random != null)
                node.next.random = node.random.next;
            node = node.next.next;
        }

        RandomListNode newHead = head.next;
        node = head;
        while(node != null){
            RandomListNode newNode = node.next;
            node.next = newNode.next;
            if(newNode.next!=null)
                newNode.next = newNode.next.next;
            node = node.next;
        }
        return newHead;
    }
    public static void main(String[] args) {

    }
}
