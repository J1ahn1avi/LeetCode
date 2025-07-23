//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>res=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=target-nums[i];
            if(res.containsKey(t)) return new int[]{res.get(t),i};

            res.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
