//503. Next Greater Element II
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int j = i % n;
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                stack.pop();
            }
            if (i < n)
                res[j] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(j);
        }
        return res;
    }
}
