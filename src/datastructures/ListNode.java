package datastructures;

public class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static void printNodes(ListNode head) {
    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }
}