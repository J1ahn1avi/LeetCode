//209. Minimum Size Subarray Sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int currSum=0;
        int currLen=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            while(currSum>=target){
                currLen=i-left+1;
                min=Math.min(min,currLen);
                currSum=currSum-nums[left];
                left++;
            }
        }
        return (min==Integer.MAX_VALUE) ? 0 : min;
    }
}
