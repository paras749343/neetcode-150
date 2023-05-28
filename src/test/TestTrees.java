package test;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.trees.InvertBinaryTreeQ226;
import problems.trees.MaximumDepthOfBinaryTreeQ104;
import test.utils.TestUtils;

public class TestTrees {

  @Test
  public void testInvertBinaryTreeQ226() {
    InvertBinaryTreeQ226 invertBinaryTreeQ226 = new InvertBinaryTreeQ226();
    var result = invertBinaryTreeQ226.invertTree(
        TestUtils.levelOderArrayToTree(List.of(4, 2, 7, 1, 3, 6, 9)));
    Assert.assertArrayEquals(new int[]{4, 7, 2, 9, 6, 3, 1},
        TestUtils.TreeToLevelOrderArray(result));
  }

  @Test
  public void testMaximumDepthOfBinaryTreeQ104() {
    MaximumDepthOfBinaryTreeQ104 maximumDepthOfBinaryTreeQ104 = new MaximumDepthOfBinaryTreeQ104();
    var result = maximumDepthOfBinaryTreeQ104.maxDepth(TestUtils.levelOderArrayToTree(
        List.of(3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7)));
    Assert.assertEquals(3, result);
  }

}
