package problems.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumQ15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(i == 0 || nums[i - 1] != nums[i])
                twoSum(nums, i, res);
        }
        return res;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int low = i+1, high = nums.length - 1;
        while(low< high){
            int sum = nums[i] + nums[low] + nums[high];
            if(sum < 0  || (low > i + 1 && nums[low] == nums[low - 1]))
                ++low;
            else if( sum> 0 || (high < nums.length -1  && nums[high] == nums[high+1]))
                --high;
            else{
                res.add(List.of(nums[i], nums[low++], nums[high--]));
            }
        }
    }
}
