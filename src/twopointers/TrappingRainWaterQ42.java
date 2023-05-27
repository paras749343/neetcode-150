package twopointers;

public class TrappingRainWaterQ42 {
    public int trap(int[] height) {
        int trapped = 0;
        int i = 0, j = height.length - 1;
        int maxLeft = height[i], maxRight = height[j];
        while (i < j){
            if(maxLeft <= maxRight){
                i++;
                trapped += Math.max(maxLeft - height[i], 0);
                maxLeft = Math.max(maxLeft, height[i]);
            }
            else {
                j--;
                trapped += Math.max(maxRight - height[j], 0);
                maxRight = Math.max(maxRight, height[j]);
            }

        }
        return trapped;
    }
}
