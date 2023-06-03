package problems.arraysandhashing;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1: Input: nums = [2,7,11,15], target = 9, Output: [0,1] Explanation: Because nums[0] +
 * nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2: Input: nums = [3,2,4], target = 6, Output: [1,2]
 * <p>
 * Example 3:Input: nums = [3,3], target = 6, Output: [0,1]
 */
public class TwoSumQ1 {

  public int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(target - nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
        ans[0] = i;
        ans[1] = map.get(nums[i]);
      }
    }
    return ans;
  }

}
