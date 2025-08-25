//80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=0;
        for(int i:nums){
            if(ptr<2 || i!=nums[ptr-2]){
                nums[ptr]=i;
                ptr++;
            }
        }
        return ptr;
    }
}
