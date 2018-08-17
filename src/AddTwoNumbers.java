


class AddTwoNumbers {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry = 0;
      ListNode root = null;
      ListNode currentRoot = null;
      while(l1 != null || l2 != null || carry > 0) {
          int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
          carry = sum / 10;
          sum = sum % 10;
          if (currentRoot != null) {
              currentRoot.next = new ListNode(sum);
              currentRoot = currentRoot.next;
          } else {
              root = currentRoot = new ListNode(sum);
          }
          if (l1 != null) {
              l1 = l1.next;
          }
          if(l2 != null) {
              l2 = l2.next;
          }
          
      }
      
      return root;
  }
    public static void main(String[] args) {

    }
}
