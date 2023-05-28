package problems.binarysearch;

public class KokoEatingBananasQ875 {

  public int minEatingSpeed(int[] piles, int h) {
    int max_element = 0;
    int min_element = 1;
    for (int element : piles) {
      if (element > max_element) {
        max_element = element;
      }
    }
    int mid_element;
    int time_taken;
    while (min_element < max_element) {
      time_taken = 0;
      mid_element = min_element + (max_element - min_element) / 2;
      for (int pile : piles) {
        if (pile % mid_element != 0) {
          time_taken += (pile / mid_element) + 1;
        } else {
          time_taken += pile / mid_element;
        }
      }
      if (time_taken <= h) {
        max_element = mid_element;
      } else {
        min_element = mid_element + 1;
      }
    }
    return max_element;
  }
}
