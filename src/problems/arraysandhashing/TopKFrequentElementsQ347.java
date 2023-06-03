package problems.arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return
 * the answer in any order.
 * <p>
 * Example 1: Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2]
 * <p>
 * Example 2: Input: nums = [1], k = 1 Output: [1]
 */
public class TopKFrequentElementsQ347 {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> mp = new HashMap<>();
    for (int num : nums) {
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
    list.sort((o1, o2) -> {
      if (Objects.equals(o1.getValue(), o2.getValue())) {
        return o2.getKey() - o1.getKey();
      } else {
        return o2.getValue() - o1.getValue();
      }
    });
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = list.get(i).getKey();
    }
    return result;
  }
}
