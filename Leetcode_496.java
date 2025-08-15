//496. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[n2.length];
        for (int i = n2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && n2[i] > stack.peek()) {
                stack.pop();
            }
            arr[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(n2[i]);
        }

        int res[] = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if (n2[j] == n1[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
}
