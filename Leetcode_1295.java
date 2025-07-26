//1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digit_count=0;
            while(nums[i]!=0){
                int rem=nums[i]%10;
                digit_count++;
                nums[i]=nums[i]/10;
            }
            if(digit_count%2==0) count++;
        }
        return count;
    }
}
