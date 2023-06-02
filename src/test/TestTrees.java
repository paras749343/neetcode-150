package test;

import static test.utils.TestUtils.TreeToLevelOrderArray;
import static test.utils.TestUtils.levelOderArrayListToTree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.trees.BinaryTreeLevelOrderTraversalQ02;
import problems.trees.BinaryTreeRightSideViewQ199;
import problems.trees.InvertBinaryTreeQ226;
import problems.trees.MaximumDepthOfBinaryTreeQ104;
import problems.trees.SameTreeQ100;
import problems.trees.SubtreeOfAnotherTreeQ572;
import problems.trees.ValidateBinarySearchTreeQ98;


public class TestTrees {

  @Test
  public void testInvertBinaryTreeQ226() {
    InvertBinaryTreeQ226 invertBinaryTreeQ226 = new InvertBinaryTreeQ226();
    var result = invertBinaryTreeQ226.invertTree(
        levelOderArrayListToTree(List.of(4, 2, 7, 1, 3, 6, 9)));
    Assert.assertArrayEquals(new int[]{4, 7, 2, 9, 6, 3, 1},
        TreeToLevelOrderArray(result));
  }

  @Test
  public void testMaximumDepthOfBinaryTreeQ104() {
    MaximumDepthOfBinaryTreeQ104 maximumDepthOfBinaryTreeQ104 = new MaximumDepthOfBinaryTreeQ104();
    var result = maximumDepthOfBinaryTreeQ104.maxDepth(levelOderArrayListToTree(
        List.of(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7)));
    Assert.assertEquals(3, result);
  }

  @Test
  public void testSameTreeQ100() {
    SameTreeQ100 sameTreeQ100 = new SameTreeQ100();
    var result = sameTreeQ100.isSameTree(
        levelOderArrayListToTree(List.of(1, 2, 3, 4, 5, 6, 7)),
        levelOderArrayListToTree(List.of(1, 2, 3, 4, 5, 6, 7)));
    Assert.assertTrue(result);
  }

  @Test
  public void testSubtreeOfAnotherTreeQ572() {
    SubtreeOfAnotherTreeQ572 subtreeOfAnotherTreeQ572 = new SubtreeOfAnotherTreeQ572();
    var result = subtreeOfAnotherTreeQ572.isSubtree(
        levelOderArrayListToTree(List.of(3, 4, 5, 1, 2)),
        levelOderArrayListToTree(List.of(4, 1, 2)));
    Assert.assertTrue(result);

  }

  @Test
  public void testBinaryTreeLevelOrderTraversalQ02() {
    BinaryTreeLevelOrderTraversalQ02 binaryTreeLevelOrderTraversalQ02 = new BinaryTreeLevelOrderTraversalQ02();
    var result = binaryTreeLevelOrderTraversalQ02.levelOrder(
        levelOderArrayListToTree(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    System.out.println(result);
    List<List<Integer>> expectedList = new ArrayList<>();
    expectedList.add(List.of(1));
    expectedList.add(List.of(2, 3));
    expectedList.add(List.of(4, 5, 6, 7));
    expectedList.add(List.of(8, 9, 10));
    Assert.assertEquals(expectedList, result);
  }

  @Test
  public void testBinaryTreeRightSideViewQ199() {
    BinaryTreeRightSideViewQ199 binaryTreeRightSideViewQ199 = new BinaryTreeRightSideViewQ199();
    var result = binaryTreeRightSideViewQ199.rightSideView(
        levelOderArrayListToTree(List.of(1, 2, 3, 4)));
    Assert.assertEquals(List.of(1, 3, 4), result);
  }

  @Test
  public void testValidateBinarySearchTreeQ98() {
    ValidateBinarySearchTreeQ98 validateBinarySearchTreeQ98 = new ValidateBinarySearchTreeQ98();
    var result = validateBinarySearchTreeQ98.isValidBST(levelOderArrayListToTree(List.of(2, 1, 3)));
    Assert.assertTrue(result);
  }
}
