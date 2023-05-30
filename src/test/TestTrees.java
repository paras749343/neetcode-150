package test;

import static test.utils.TestUtils.TreeToLevelOrderArray;
import static test.utils.TestUtils.levelOderArrayListToTree;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.trees.InvertBinaryTreeQ226;
import problems.trees.MaximumDepthOfBinaryTreeQ104;
import problems.trees.SameTreeQ100;
import problems.trees.SubtreeOfAnotherTreeQ572;


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
}
