package test;

import static test.utils.TestUtils.isSimilarListOfList;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.twopointers.ContainerWithMostWaterQ11;
import problems.twopointers.ThreeSumQ15;
import problems.twopointers.TrappingRainWaterQ42;
import problems.twopointers.TwoSumV2Q167;
import problems.twopointers.ValidPalindromeQ125;


public class TestTwoPointers {

  @Test
  public void testValidPalindromeQ125() {
    ValidPalindromeQ125 validPalindromeQ125 = new ValidPalindromeQ125();
    var result = validPalindromeQ125.isPalindrome("A man, a plan, a canal: Panama");
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoSumV2Q167() {
    TwoSumV2Q167 twoSumV2Q167 = new TwoSumV2Q167();
    var result = twoSumV2Q167.twoSum(new int[]{2, 7, 11, 15}, 9);
    Assert.assertArrayEquals(new int[]{1, 2}, result);
  }

  @Test
  public void testThreeSumQ15() {
    ThreeSumQ15 threeSumQ15 = new ThreeSumQ15();
    var result = threeSumQ15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(-1, -1, 2));
    expected.add(List.of(-1, 0, 1));
    Assert.assertTrue(isSimilarListOfList(expected, result));
  }

  @Test
  public void testContainerWithMostWaterQ11() {
    ContainerWithMostWaterQ11 containerWithMostWaterQ11 = new ContainerWithMostWaterQ11();
    var result = containerWithMostWaterQ11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    Assert.assertEquals(49, result);
  }

  @Test
  public void testTrappingRainWaterQ42() {
    TrappingRainWaterQ42 trappingRainWaterQ42 = new TrappingRainWaterQ42();
    var result = trappingRainWaterQ42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    Assert.assertEquals(6, result);

  }
}
