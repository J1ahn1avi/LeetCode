//1004. Max Consecutive Ones III
class Solution {
    public int longestOnes(int[] nums, int k) {
        int j = 0;
        int zeros = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[j] == 0) {
                    zeros--;
                }
                j++;
            }
            maxLen = Math.max(maxLen, i - j+1);
        }
        return maxLen;
    }
}
