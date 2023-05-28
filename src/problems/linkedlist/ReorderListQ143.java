package problems.linkedlist;

import datastructures.ListNode;

public class ReorderListQ143 {

  public void reorderList(ListNode head) {
    ReverseLinkedListQ206 reverseLinkedListQ206 = new ReverseLinkedListQ206();
    ListNode head2 = reverseLinkedListQ206.reverseList(findCenter(head));
    while (head2.next != null) {
      ListNode tmp1 = head.next;
      ListNode tmp2 = head2.next;
      head.next = head2;
      head2.next = tmp1;
      head = tmp1;
      head2 = tmp2;

    }

  }

  private ListNode findCenter(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }


}
