package test;

import org.junit.Assert;
import org.junit.Test;
import problems.slidingwindow.BestTimeToBuyAndSellStockQ121;
import problems.slidingwindow.LongestRepeatingCharacterReplacementQ424;
import problems.slidingwindow.LongestSubstringWithoutRepeatingCharactersQ3;
import problems.slidingwindow.PermutationInStringQ567;

public class TestSlidingWindow {

  @Test
  public void testBestTimeToBuyAndSellStockQ121() {
    BestTimeToBuyAndSellStockQ121 bestTimeToBuyAndSellStockQ121 = new BestTimeToBuyAndSellStockQ121();
    var result = bestTimeToBuyAndSellStockQ121.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    Assert.assertEquals(5, result);
  }

  @Test
  public void testLongestSubstringWithoutRepeatingCharactersQ3() {
    LongestSubstringWithoutRepeatingCharactersQ3 longestSubstringWithoutRepeatingCharactersQ3 = new LongestSubstringWithoutRepeatingCharactersQ3();
    var result = longestSubstringWithoutRepeatingCharactersQ3.lengthOfLongestSubstring("abcabcbb");
    Assert.assertEquals(3, result);
  }

  @Test
  public void testLongestRepeatingCharacterReplacementQ424() {
    LongestRepeatingCharacterReplacementQ424 longestRepeatingCharacterReplacementQ424 = new LongestRepeatingCharacterReplacementQ424();
    var result = longestRepeatingCharacterReplacementQ424.characterReplacement("ABAB", 2);
    Assert.assertEquals(4, result);
  }

  @Test
  public void PermutationInStringQ567() {
    PermutationInStringQ567 permutationInStringQ567 = new PermutationInStringQ567();
    var result = permutationInStringQ567.checkInclusion("ab", "eidbaooo");
    Assert.assertTrue(result);
  }
}
