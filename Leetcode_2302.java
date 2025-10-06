//2302. Count Subarrays With Score Less Than K
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left=0;
        long count=0;
        long currSum=0;

        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            while(currSum*(i-left+1)>=k){
                currSum-=nums[left];
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
}
