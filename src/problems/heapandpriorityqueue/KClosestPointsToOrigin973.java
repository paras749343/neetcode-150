package problems.heapandpriorityqueue;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin973 {

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<AbstractMap.SimpleEntry<int[], Integer>> priorityQueue = new PriorityQueue<>(
        (o1, o2) -> o2.getValue() - o1.getValue());
    for (int[] point : points) {
      int dist = distance(point);
      if (priorityQueue.size() < k) {
        priorityQueue.add(new SimpleEntry<>(point, dist));
      } else if (priorityQueue.peek().getValue() > dist) {
        priorityQueue.poll();
        priorityQueue.add(new SimpleEntry<>(point, dist));
      }

    }
    int[][] result = new int[k][2];
    var iterator = priorityQueue.iterator();
    for (int i = 0; i < k; i++) {
      var item = iterator.next().getKey();
      result[i][0] = item[0];
      result[i][1] = item[1];
    }
    return result;
  }

  private int distance(int[] point) {
    return point[0] * point[0] + point[1] * point[1];
  }

}
