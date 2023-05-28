package problems.linkedlist;

import datastructures.ListNode;

public class RemoveNthNodeFromEndOfListQ19 {

  private int counter = 0;

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head != null) {
      head.next = removeNthFromEnd(head.next, n);
      ++counter;
      if (counter == n) {
        head = head.next;
      }
    }
    return head;
  }

}
