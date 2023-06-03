package problems.arraysandhashing;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1: Input: s = "anagram", t = "nagaram", Output: true
 * <p>
 * Example 2: Input: s = "rat", t = "car", Output: false
 */
public class ValidAnagramQ242 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] a = new int[256];
    int[] b = new int[256];
    for (int i = 0; i < 256; i++) {
      a[i] = 0;
      b[i] = 0;
    }

    for (int i = 0; i < s.length(); i++) {
      a[s.charAt(i)]++;
    }
    for (int i = 0; i < t.length(); i++) {
      b[t.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }
}
