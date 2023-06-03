package problems.arraysandhashing;

import java.util.HashSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements
 * sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1: Input: nums = [100,4,200,1,3,2], Output: 4 Explanation: The longest consecutive
 * elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * <p>
 * Example 2: Input: nums = [0,3,7,2,5,8,4,6,0,1], Output: 9
 */
public class LongestConsecutiveSequenceQ128 {

  public int longestConsecutive(int[] nums) {
    HashSet<Integer> s = new HashSet<>();
    int answer = 0;
    for (int num : nums) {
      s.add(num);
    }
    for (int num : nums) {
      if (!s.contains(num - 1)) {
        int i = num;
        while (s.contains(i)) {
          i++;
        }
        answer = Math.max(answer, i - num);
      }
    }
    return answer;
  }
}
