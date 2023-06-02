package problems.trees;

import datastructures.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the
 * values of the nodes you can see ordered from top to bottom.
 */

public class BinaryTreeRightSideViewQ199 {

  public List<Integer> rightSideView(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<Integer> answer = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int length = queue.size(), itr = 0;
      answer.add(queue.peek().val);
      while (itr < length) {
        TreeNode polled = queue.poll();
        if (polled.right != null) {
          queue.offer(polled.right);
        }
        if (polled.left != null) {
          queue.offer(polled.left);
        }
        ++itr;
      }
    }
    return answer;
  }
}
