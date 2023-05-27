package arraysandhashing;

import java.util.HashMap;

public class TwoSumQ1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap< Integer , Integer > map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(target-nums[i],i);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&& map.get(nums[i])!=i){
                ans[0]=i;
                ans[1]=map.get(nums[i]);
            }
        }
        return ans;
    }

}
