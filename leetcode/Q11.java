/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * 盛最多的水
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class Q11 {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return area;
    }
}
