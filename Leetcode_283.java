//283.Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0, p2 = 0;
        while (p2 < nums.length) {
            if (nums[p2] != 0) {
                nums[p1] = nums[p2];
                p1++;
            }
            p2++;
        }
        while (p1 < nums.length) {
            nums[p1] = 0;
            p1++;
        }
    }
}
