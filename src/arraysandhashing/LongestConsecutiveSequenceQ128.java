package arraysandhashing;

import java.util.HashSet;

public class LongestConsecutiveSequenceQ128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int answer = 0;
        for(int num : nums){
            s.add(num);
        }
        for(int num: nums ){
            if(!s.contains(num-1)){
                int i = num;
                while(s.contains(i)) i++;
                answer = Math.max(answer, i - num);
            }
        }
        return answer;
    }
}
