package test;

import org.junit.Assert;
import org.junit.Test;
import problems.binarysearch.BinarySearchQ704;
import problems.binarysearch.FindMinimumInRotatedSortedArrayQ53;
import problems.binarysearch.KokoEatingBananasQ875;
import problems.binarysearch.SearchA2DMatrixQ74;
import problems.binarysearch.TimeBasedKeyValueStoreQ981;

public class TestBinarySearch {

  @Test
  public void testBinarySearchQ704() {
    BinarySearchQ704 binarySearchQ704 = new BinarySearchQ704();
    var result = binarySearchQ704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testSearchA2DMatrixQ74() {
    SearchA2DMatrixQ74 searchA2DMatrixQ74 = new SearchA2DMatrixQ74();
    var result = searchA2DMatrixQ74.searchMatrix(getTestSorted2DArray(), 3);
    Assert.assertTrue(result);
  }

  @Test
  public void testKokoEatingBananasQ875() {
    KokoEatingBananasQ875 kokoEatingBananasQ875 = new KokoEatingBananasQ875();
    var result = kokoEatingBananasQ875.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5);
    Assert.assertEquals(30, result);
  }

  @Test
  public void testFindMinimumInRotatedSortedArrayQ53() {
    FindMinimumInRotatedSortedArrayQ53 findMinimumInRotatedSortedArrayQ53 = new FindMinimumInRotatedSortedArrayQ53();
    var result = findMinimumInRotatedSortedArrayQ53.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
    Assert.assertEquals(0, result);
  }

  @Test
  public void testTimeBasedKeyValueStoreQ981() {
    TimeBasedKeyValueStoreQ981 timeBasedKeyValueStoreQ981 = new TimeBasedKeyValueStoreQ981();
    timeBasedKeyValueStoreQ981.set("foo", "bar", 1);
    Assert.assertEquals("bar", timeBasedKeyValueStoreQ981.get("foo", 1));
    Assert.assertEquals("bar", timeBasedKeyValueStoreQ981.get("foo", 3));
    timeBasedKeyValueStoreQ981.set("foo", "bar2", 4);
    Assert.assertEquals("bar2", timeBasedKeyValueStoreQ981.get("foo", 4));
    Assert.assertEquals("bar2", timeBasedKeyValueStoreQ981.get("foo", 5));
  }

  private int[][] getTestSorted2DArray() {
    return new int[][]{
        new int[]{1, 3, 5, 7},
        new int[]{10, 11, 16, 20},
        new int[]{23, 30, 34, 60}
    };
  }

}
