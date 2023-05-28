package problems.linkedlist;

import datastructures.ListNode;

public class AddTwoNumbersQ2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode headNode = addNodes(l1, l2, 0);
    ListNode currentNode = headNode;
    int carry = extractCarry(headNode);
    l1 = l1.next;
    l2 = l2.next;
    while (l1 != null && l2 != null) {
      currentNode.next = addNodes(l1, l2, carry);
      currentNode = currentNode.next;
      carry = extractCarry(currentNode);
      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null) {
      currentNode.next = addNodes(l1, null, carry);
      currentNode = currentNode.next;
      carry = extractCarry(currentNode);
      l1 = l1.next;
    }
    while (l2 != null) {
      currentNode.next = addNodes(l2, null, carry);
      currentNode = currentNode.next;
      carry = extractCarry(currentNode);
      l2 = l2.next;
    }
    if (carry == 1) {
      currentNode.next = new ListNode(1);
    }
    return headNode;
  }

  private ListNode addNodes(ListNode a, ListNode b, int carry) {
    if (b == null) {
      return new ListNode(a.val + carry);
    }
    return new ListNode(a.val + b.val + carry);
  }

  private int extractCarry(ListNode headNode) {
    if (headNode.val > 9) {
      headNode.val -= 10;
      return 1;
    } else {
      return 0;
    }
  }

}
