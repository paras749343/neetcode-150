package problems.binarysearch;

public class BinarySearchQ704 {

  public int search(int[] nums, int target) {
    int iterator_start = 0;
    int iterator_end = nums.length - 1;
    int iterator_mid = (iterator_start + iterator_end) / 2;
    while (iterator_start <= iterator_end) {
      if (nums[iterator_mid] < target) {
        iterator_start = iterator_mid + 1;
        iterator_mid = (iterator_start + iterator_end) / 2;
      } else if (nums[iterator_mid] > target) {
        iterator_end = iterator_mid - 1;
        iterator_mid = (iterator_start + iterator_end) / 2;
      } else {
        return iterator_mid;
      }
    }
    return -1;
  }
}
