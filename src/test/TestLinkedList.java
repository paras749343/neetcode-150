package test;

import datastructures.ListNode;
import org.junit.Assert;
import org.junit.Test;
import problems.linkedlist.AddTwoNumbersQ2;
import problems.linkedlist.FindTheDuplicateNumberQ287;
import problems.linkedlist.LinkedListCycleQ141;
import problems.linkedlist.MergeTwoSortedListsQ21;
import problems.linkedlist.RemoveNthNodeFromEndOfListQ19;
import problems.linkedlist.ReorderListQ143;
import problems.linkedlist.ReverseLinkedListQ206;
import test.utils.TestUtils;

public class TestLinkedList {

  @Test
  public void testReverseLinkedListQ206() {
    ReverseLinkedListQ206 reverseLinkedListQ206 = new ReverseLinkedListQ206();
    var result = reverseLinkedListQ206.reverseList(
        TestUtils.intArrayToListNode(new int[]{1, 2, 3, 4, 5}));
    Assert.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, TestUtils.listNodeListToIntArray(result));
  }

  @Test
  public void testMergeTwoSortedListsQ21() {
    MergeTwoSortedListsQ21 mergeTwoSortedListsQ21 = new MergeTwoSortedListsQ21();
    var result = mergeTwoSortedListsQ21.mergeTwoLists(
        TestUtils.intArrayToListNode(new int[]{1, 2, 4}),
        TestUtils.intArrayToListNode(new int[]{1, 3, 4}));
    Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, TestUtils.listNodeListToIntArray(result));
  }

  @Test
  public void testReorderListQ143() {
    ReorderListQ143 reorderListQ143 = new ReorderListQ143();
    ListNode head = TestUtils.intArrayToListNode(new int[]{1, 2, 3, 4, 5});
    reorderListQ143.reorderList(head);
    Assert.assertArrayEquals(new int[]{1, 5, 2, 4, 3}, TestUtils.listNodeListToIntArray(head));
  }

  @Test
  public void testRemoveNthNodeFromEndOfListQ19() {
    RemoveNthNodeFromEndOfListQ19 removeNthNodeFromEndOfListQ19 = new RemoveNthNodeFromEndOfListQ19();
    var result = removeNthNodeFromEndOfListQ19.removeNthFromEnd(
        TestUtils.intArrayToListNode(new int[]{1, 2, 3, 4, 5}), 2);
    Assert.assertArrayEquals(new int[]{1, 2, 3, 5}, TestUtils.listNodeListToIntArray(result));
  }

  @Test
  public void testAddTwoNumbersQ2() {
    AddTwoNumbersQ2 addTwoNumbersQ2 = new AddTwoNumbersQ2();
    var result = addTwoNumbersQ2.addTwoNumbers(
        TestUtils.intArrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
        TestUtils.intArrayToListNode(new int[]{9, 9, 9, 9}));
    Assert.assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1},
        TestUtils.listNodeListToIntArray(result));
  }

  @Test
  public void testLinkedListCycleQ141() {
    LinkedListCycleQ141 linkedListCycleQ141 = new LinkedListCycleQ141();
    var result = linkedListCycleQ141.hasCycle(getDummyLinkedList());
    Assert.assertTrue(result);
  }

  @Test
  public void testFindTheDuplicateNumberQ287() {
    FindTheDuplicateNumberQ287 findTheDuplicateNumberQ287 = new FindTheDuplicateNumberQ287();
    var result = findTheDuplicateNumberQ287.findDuplicate(new int[]{3, 1, 3, 4, 2});
    Assert.assertEquals(3, result);
  }

  private ListNode getDummyLinkedList() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node3;
    return node1;
  }

}
