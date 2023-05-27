package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsQ49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, Integer> frequencyPositionMap = new HashMap<>();
        int position = 0;
        for(String word: strs){
            HashMap<Character, Integer> frequencyMap = getFrequencyMap(word);
            if(frequencyPositionMap.containsKey(frequencyMap)){
                ans.get(frequencyPositionMap.get(frequencyMap)).add(word);
            }
            else{
                List<String> words = new ArrayList<>();
                words.add(word);
                ans.add(words);
                frequencyPositionMap.put(frequencyMap, position);
                position++;
            }

        }
        return ans;
    }

    private HashMap<Character, Integer> getFrequencyMap(String word){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            if(frequencyMap.containsKey(word.charAt(i))){
                Integer count = frequencyMap.get(word.charAt(i));
                frequencyMap.put(word.charAt(i), count + 1);
            }
            else{
                frequencyMap.put(word.charAt(i), 1);
            }
        }
        return frequencyMap;
    }
}
