//1493. Longest Subarray of 1's After Deleting One Element
class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0;
        int zeros = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[j] == 0) {
                    zeros--;
                }
                j++;
            }
            maxLen = Math.max(maxLen, i - j);
        }
        return maxLen;
    }
}
