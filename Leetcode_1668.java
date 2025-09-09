//1668. Maximum Repeating Substring
class Solution {
    public int maxRepeating(String s, String word) {
        int n = s.length();
        int m = word.length();
        int dp[] = new int[n + 1];
        int res = 0;

        for (int i = m; i <= n; i++) {
            String sub = s.substring(i - m, i);
            if (sub.equals(word)) {
                dp[i] = dp[i - m] + 1;
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
