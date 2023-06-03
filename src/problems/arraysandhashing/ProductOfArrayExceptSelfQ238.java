package problems.arraysandhashing;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1: Input: nums = [1,2,3,4], Output: [24,12,8,6]
 * <p>
 * Example 2: Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelfQ238 {

  public int[] productExceptSelf(int[] nums) {
    if (nums.length == 1) {
      return new int[]{0};
    }
    int i, temp = 1, n = nums.length;
    int[] prod = new int[n];
    Arrays.fill(prod, 1);

    for (i = 0; i < n; i++) {
      prod[i] = temp;
      temp *= nums[i];
    }
    temp = 1;

    for (i = n - 1; i >= 0; i--) {
      prod[i] *= temp;
      temp *= nums[i];
    }

    return prod;
  }
}
