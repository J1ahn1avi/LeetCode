class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ptr1 = cost[0];
        int ptr2 = cost[1];
        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(ptr1, ptr2);
            ptr1 = ptr2;
            ptr2 = curr;
        }
        return Math.min(ptr1, ptr2);
    }
}
