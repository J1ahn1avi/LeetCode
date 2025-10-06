//643. Maximum Average Subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=nums[i];
        }
        int maxSum=currSum;
        for(int i=k;i<nums.length;i++){
            currSum+=nums[i];
            currSum-=nums[left];
            left++;
            maxSum=Math.max(maxSum,currSum);
        }
        return (double) maxSum/k;
    }
}
