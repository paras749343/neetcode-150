package problems.slidingwindow;

public class LongestSubstringWithoutRepeatingCharactersQ3 {

  public int lengthOfLongestSubstring(String s) {
    int answer = -1, begin = 0;
    if (s.isEmpty()) {
      return 0;
    } else if (s.length() == 1) {
      return 1;
    }
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      String substr = s.substring(begin, i);
      if (substr.contains(String.valueOf(c))) {
        begin += substr.indexOf(c) + 1;
      }
      answer = Math.max(answer, i + 1 - begin);
    }
    return answer;
  }
}
