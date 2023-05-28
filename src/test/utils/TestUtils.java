package test.utils;

import datastructures.ListNode;
import datastructures.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class TestUtils {

  public static <T> boolean isSimilarListOfList(List<List<T>> expected, List<List<T>> actual) {
    HashSet<HashSet<T>> expectedHashSet = new HashSet<>();
    HashSet<HashSet<T>> actualHashSet = new HashSet<>();
    for (List<T> stringList : expected) {
      expectedHashSet.add(new HashSet<>(stringList));
    }

    for (List<T> stringList : actual) {
      actualHashSet.add(new HashSet<>(stringList));
    }
    return Objects.equals(expectedHashSet, actualHashSet);
  }

  public static <T> boolean isSimilarList(List<T> expected, List<T> actual) {
    return Objects.equals(new HashSet<>(expected), new HashSet<>(actual));
  }

  public static List<Integer> intArrayToIntegerList(int[] input) {
    List<Integer> outputList = new ArrayList<>();
    Arrays.stream(input).forEach(outputList::add);
    return outputList;
  }

  public static int[] listNodeListToIntArray(ListNode input) {
    List<Integer> temporaryList = new ArrayList<>();
    while (input != null) {
      temporaryList.add(input.val);
      input = input.next;
    }
    return temporaryList.stream().mapToInt(i -> i).toArray();
  }

  public static ListNode intArrayToListNode(int[] input) { //TODO adopt it to List as input
    ListNode head = null;
    ListNode current = null;

    for (int val : input) {
      if (current == null) {
        current = new ListNode(val);
        head = current;
      } else {
        current.next = new ListNode(val);
        current = current.next;
      }
    }
    return head;
  }

  public static TreeNode levelOderArrayToTree(List<Integer> input) {
    return insertLevelOrder(input, 0);
  }

  private static TreeNode insertLevelOrder(List<Integer> input, int iterator) {
    TreeNode root = null;
    if (iterator < input.size() && input.get(iterator) != Integer.MIN_VALUE) {
      root = new TreeNode(input.get(iterator));
      root.left = insertLevelOrder(input, 2 * iterator + 1);
      root.right = insertLevelOrder(input, 2 * iterator + 2);
    }
    return root;
  }

  public static int[] TreeToLevelOrderArray(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode tempNode = queue.poll();
      list.add(tempNode.val);
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
    return list.stream().mapToInt(i -> i).toArray();
  }
}
