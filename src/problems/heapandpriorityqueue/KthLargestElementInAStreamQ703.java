package problems.heapandpriorityqueue;

import java.util.PriorityQueue;

/**
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest
 * element in the sorted order, not the kth distinct element.
 * <p>
 * Implement KthLargest class:
 * <p>
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of
 * integers nums. int add(int val) Appends the integer val to the stream and returns the element
 * representing the kth largest element in the stream.
 */
public class KthLargestElementInAStreamQ703 {

  private final PriorityQueue<Integer> priorityQueue;
  private final int k;

  public KthLargestElementInAStreamQ703(int k, int[] nums) {
    priorityQueue = new PriorityQueue<>();
    this.k = k;
    for (int num : nums) {
      this.add(num);
    }
  }

  public int add(int val) {
    if (priorityQueue.size() < k) {
      priorityQueue.add(val);
    } else if (priorityQueue.peek() < val) {
      priorityQueue.poll();
      priorityQueue.add(val);
    }
    return priorityQueue.peek();
  }

}
