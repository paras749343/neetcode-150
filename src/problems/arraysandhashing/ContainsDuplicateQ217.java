package problems.arraysandhashing;

import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 * <p>
 * Example 1: Input: nums = [1,2,3,1], Output: true
 * <p>
 * Example 2: Input: nums = [1,2,3,4], Output: false
 * <p>
 * Example 3: Input: nums = [1,1,1,3,3,4,3,2,4,2], Output: true
 * <p>
 */
public class ContainsDuplicateQ217 {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }
}
