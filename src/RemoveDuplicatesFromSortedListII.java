
public class RemoveDuplicatesFromSortedListII {
    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode pre = helper;
        ListNode cur = head;
        while(cur!=null)
        {
            while(cur.next!=null && pre.next.val==cur.next.val)
            {
                cur = cur.next;
            }
            if(pre.next==cur)
            {
                pre = pre.next;
            }
            else
            {
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return helper.next;
    }

    public static void main(String[] args) {

    }
}
