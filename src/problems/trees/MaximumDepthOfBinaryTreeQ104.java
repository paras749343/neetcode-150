package problems.trees;

import datastructures.TreeNode;

public class MaximumDepthOfBinaryTreeQ104 {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

}
