//322. Coin Change
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];

        if (amount == 0)
            return 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i : coins) {
            for (int j = i; j <= amount; j++) {
                if (dp[j - i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - i]);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }
}
