package problems.arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any
 * order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1: Input: stringArray = ["eat","tea","tan","ate","nat","bat"], Output:
 * [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Example 2: Input: stringArray = [""], Output: [[""]]
 * <p>
 * Example 3: Input: stringArray = ["a"], Output: [["a"]]
 */
public class GroupAnagramsQ49 {

  public List<List<String>> groupAnagrams(String[] stringArray) {
    List<List<String>> ans = new ArrayList<>();
    HashMap<HashMap<Character, Integer>, Integer> frequencyPositionMap = new HashMap<>();
    int position = 0;
    for (String word : stringArray) {
      HashMap<Character, Integer> frequencyMap = getFrequencyMap(word);
      if (frequencyPositionMap.containsKey(frequencyMap)) {
        ans.get(frequencyPositionMap.get(frequencyMap)).add(word);
      } else {
        List<String> words = new ArrayList<>();
        words.add(word);
        ans.add(words);
        frequencyPositionMap.put(frequencyMap, position);
        position++;
      }

    }
    return ans;
  }

  private HashMap<Character, Integer> getFrequencyMap(String word) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      if (frequencyMap.containsKey(word.charAt(i))) {
        Integer count = frequencyMap.get(word.charAt(i));
        frequencyMap.put(word.charAt(i), count + 1);
      } else {
        frequencyMap.put(word.charAt(i), 1);
      }
    }
    return frequencyMap;
  }
}
