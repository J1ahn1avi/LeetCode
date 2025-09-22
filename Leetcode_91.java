//91. Decode Ways
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int dp[] = new int[n + 1];
        if (s.charAt(0) == '0')
            return 0;
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int digit1 = Integer.parseInt(s.substring(i - 1, i));
            int digit2 = Integer.parseInt(s.substring(i - 2, i));
            if (digit1 >= 1 && digit1 <= 9) {
                dp[i] += dp[i - 1];
            }
            if (digit2 >= 10 && digit2 <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
