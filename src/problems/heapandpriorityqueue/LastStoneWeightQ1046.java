package problems.heapandpriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeightQ1046 {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int stone : stones) {
      priorityQueue.add(stone);
    }
    while (priorityQueue.size() >= 2) {
      int max = priorityQueue.poll();
      int secondMax = priorityQueue.poll();
      int smash = max - secondMax;
      if (smash != 0) {
        priorityQueue.add(smash);
      }
    }
    return !priorityQueue.isEmpty() ? priorityQueue.peek() : 0;
  }
}
