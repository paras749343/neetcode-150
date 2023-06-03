package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.heapandpriorityqueue.DesignTwitterQ355;
import problems.heapandpriorityqueue.KClosestPointsToOrigin973;
import problems.heapandpriorityqueue.KthLargestElementInAStreamQ703;
import problems.heapandpriorityqueue.KthLargestElementInAnArrayQ215;
import problems.heapandpriorityqueue.LastStoneWeightQ1046;
import test.utils.TestUtils;

public class TestHeapAndPriorityQueue {

  @Test
  public void testKthLargestElementInAStreamQ703() {
    KthLargestElementInAStreamQ703 kthLargestElementInAStreamQ703 = new KthLargestElementInAStreamQ703(
        3, new int[]{4, 5, 8, 2});
    List<Integer> list = new ArrayList<>();
    list.add(kthLargestElementInAStreamQ703.add(3));
    list.add(kthLargestElementInAStreamQ703.add(5));
    list.add(kthLargestElementInAStreamQ703.add(10));
    list.add(kthLargestElementInAStreamQ703.add(9));
    list.add(kthLargestElementInAStreamQ703.add(4));
    System.out.println(list);

  }

  @Test
  public void testLastStoneWeightQ1046() {
    LastStoneWeightQ1046 lastStoneWeightQ1046 = new LastStoneWeightQ1046();
    var result = lastStoneWeightQ1046.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
    Assert.assertEquals(1, result);
  }

  @Test
  public void testKClosestPointsToOrigin973() {
    KClosestPointsToOrigin973 kClosestPointsToOrigin973 = new KClosestPointsToOrigin973();
    var result = kClosestPointsToOrigin973.kClosest(getDummyPoints(), 2);
    Assert.assertTrue(TestUtils.isSimilarListOfList(List.of(List.of(-2, 4), List.of(3, 3)),
        TestUtils.int2DArrayToListOfListOfInteger(result)));

  }

  @Test
  public void testKthLargestElementInAnArrayQ215() {
    KthLargestElementInAnArrayQ215 kthLargestElementInAnArrayQ215 = new KthLargestElementInAnArrayQ215();
    var result = kthLargestElementInAnArrayQ215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6},
        4);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testDesignTwitterQ355() {
    DesignTwitterQ355 designTwitterQ355 = new DesignTwitterQ355();
    designTwitterQ355.postTweet(1, 5);
    System.out.println(designTwitterQ355.getNewsFeed(1));
  }

  private int[][] getDummyPoints() {
    return new int[][]{
        new int[]{3, 3},
        new int[]{5, -1},
        new int[]{-2, 4}
    };
  }

}
