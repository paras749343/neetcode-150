package problems.slidingwindow;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacementQ424 {

  public int characterReplacement(String s, int k) {
    int[] map = new int[26];
    Arrays.fill(map, 0);
    int i, j = 0, answer = 0;
    for (i = 0; i < s.length(); ++i) {
      ++map[s.charAt(i) - 'A'];
      while (countFlips(map, i - j + 1) > k && j < i) {
        --map[s.charAt(j) - 'A'];
        ++j;
      }

      answer = Math.max(answer, i - j + 1);
    }
    return answer;
  }

  private static int countFlips(int[] map, int sum) {
    int maximum = -1;
    for (int val : map) {
      if (val > maximum) {
        maximum = val;
      }
    }
    return sum - maximum;
  }
}
