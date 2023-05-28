package problems.slidingwindow;

public class PermutationInStringQ567 {

  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }
    int[] charMap = new int[26];
    int i;
    for (i = 0; i < s1.length(); ++i) {
      ++charMap[s1.charAt(i) - 'a'];
      --charMap[s2.charAt(i) - 'a'];
    }
    for (; i < s2.length(); ++i) {
      if (checkMap(charMap)) {
        return true;
      }
      ++charMap[s2.charAt(i - s1.length()) - 'a'];
      --charMap[s2.charAt(i) - 'a'];
    }
    return checkMap(charMap);
  }

  private boolean checkMap(int[] charMap) {
    for (int element : charMap) {
      if (element != 0) {
        return false;
      }
    }
    return true;
  }
}
