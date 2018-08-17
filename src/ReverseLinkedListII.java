public class ReverseLinkedListII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;

        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode firstTail = preHead;
        int k = m - 1;
        while (k-- > 0) {
            firstTail = firstTail.next;
        }

        ListNode secondTail = firstTail.next;

        ListNode tmpHead = null;
        ListNode tmpNext = null;
        ListNode node = firstTail.next;
        k = n - m + 1;
        while (k-- > 0) {
            tmpHead = node;
            node = node.next;

            tmpHead.next = tmpNext;
            tmpNext = tmpHead;
        }

        firstTail.next = tmpHead;
        secondTail.next = node;

        return preHead.next;
    }

    public static void main(String[] args) {

    }
}
