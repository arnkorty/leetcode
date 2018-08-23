public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null
                || head.next == null
                || head.next.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        second = reverseList(second);

        ListNode first = head;
        while (second != null) {
            ListNode next = first.next;
            first.next = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }
    }

    // 就地翻转链表
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
