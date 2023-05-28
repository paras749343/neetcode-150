package problems.trees;

import datastructures.TreeNode;

public class InvertBinaryTreeQ226 {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode tempTreeNode = root.left;
    root.left = root.right;
    root.right = tempTreeNode;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }

}
