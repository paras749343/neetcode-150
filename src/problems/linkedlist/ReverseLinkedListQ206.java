package problems.linkedlist;

import datastructures.ListNode;

public class ReverseLinkedListQ206 {

  public ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode currentNext;
    ListNode prev = null;

    while (current != null) {
      currentNext = current.next;
      current.next = prev;
      prev = current;
      current = currentNext;

    }
    return prev;
  }

}
