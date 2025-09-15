//712. Minimum ASCII Delete Sum for Two Strings
class Solution {
    public int minimumDeleteSum(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + word1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + word2.charAt(j - 1);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + word1.charAt(i - 1), dp[i][j - 1] + word2.charAt(j - 1));
                }
            }
        }
        return dp[m][n];
    }
}
