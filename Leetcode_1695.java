//1695. Maximum Erasure Value

class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> window=new HashSet<>();

        int left=0,right=0;
        int currsum=0,maxSum=0;

        while(right<nums.length){

            if(!window.contains(nums[right])){
                window.add(nums[right]);
                currsum+=nums[right];
                maxSum=Math.max(maxSum,currsum);
                right++;
            }
            
            else{
                window.remove(nums[left]);
                currsum-=nums[left];
                left++;
            }

        }
        return maxSum;
    }
}
