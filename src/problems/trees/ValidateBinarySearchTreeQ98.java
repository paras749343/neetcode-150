package problems.trees;

import datastructures.TreeNode;

public class ValidateBinarySearchTreeQ98 {

  public boolean isValidBST(TreeNode root) {
    return dfs(root, null, null);

  }

  private boolean dfs(TreeNode root, Integer min, Integer max) {
    if (root == null) {
      return true;
    }

    if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
      return false;
    }
    return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
  }
}
