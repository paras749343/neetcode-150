package problems.twopointers;

public class TwoSumV2Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j = numbers.length - 1;
        while(numbers[i] + numbers[j] != target){
            while(numbers[i] + numbers[j] > target){
                j--;
            }
            while(numbers[i] + numbers[j] < target){
                i++;
            }
        }

        return new int[]{i+1, j+1};
    }
}
