package problems.trees;

import datastructures.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e.,
 * from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversalQ02 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<List<Integer>> answer = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int length = queue.size(), itr = 0;
      List<Integer> tempList = new ArrayList<>();
      while (itr < length) {
        TreeNode polled = queue.poll();
        if (polled.left != null) {
          queue.offer(polled.left);
        }
        if (polled.right != null) {
          queue.offer(polled.right);
        }
        tempList.add(polled.val);
        ++itr;
      }
      answer.add(tempList);
    }
    return answer;
  }

}
