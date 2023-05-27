package problems.twopointers;

public class ContainerWithMostWaterQ11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        while (i < j){
            area = Math.max(area,Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j])
                i = i + 1;
            else
                j = j - 1;
        }
        return area;
    }
}
