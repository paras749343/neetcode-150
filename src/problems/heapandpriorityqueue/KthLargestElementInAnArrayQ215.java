package problems.heapandpriorityqueue;

import java.util.PriorityQueue;

public class KthLargestElementInAnArrayQ215 {

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    for (int num : nums) {
      if (priorityQueue.size() < k) {
        priorityQueue.add(num);
      } else if (priorityQueue.peek() < num) {
        priorityQueue.poll();
        priorityQueue.add(num);
      }
    }
    return priorityQueue.peek();
  }

}
