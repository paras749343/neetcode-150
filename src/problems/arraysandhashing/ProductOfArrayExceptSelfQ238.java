package problems.arraysandhashing;

import java.util.Arrays;

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
