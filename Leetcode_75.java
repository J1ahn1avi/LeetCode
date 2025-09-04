//75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                c0++;
            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        int indx = 0;
        for (int i = 0; i < c0; i++) {
            nums[indx] = 0;
            indx++;
        }
        for (int i = 0; i < c1; i++) {
            nums[indx] = 1;
            indx++;
        }
        for (int i = 0; i < c2; i++) {
            nums[indx] = 2;
            indx++;
        }
    }
}
