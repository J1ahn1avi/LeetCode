//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int mx = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            mx = Math.max(mx, area);

            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return mx;
    }
}
