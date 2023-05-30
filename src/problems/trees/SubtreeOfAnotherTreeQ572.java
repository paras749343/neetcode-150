package problems.trees;

import datastructures.TreeNode;

public class SubtreeOfAnotherTreeQ572 {

  private final SameTreeQ100 sameTreeQ100 = new SameTreeQ100();

  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (subRoot == null || sameTreeQ100.isSameTree(root, subRoot)) {
      return true;
    }
    if (root == null) {
      return false;
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }


}
