package problems.linkedlist;

import datastructures.ListNode;

public class LinkedListCycleQ141 {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    while (head != null && head.next != null) {
      slow = slow.next;
      head = head.next.next;
      if (head == slow) {
        return true;
      }
    }
    return false;
  }

}
