//977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] arr) {
        int res[] = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                res[i] = arr[left] * arr[left];
                left++;
            } else {
                res[i] = arr[right] * arr[right];
                right--;
            }
        }
        return res;
    }
}
