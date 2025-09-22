//2140. Solving Questions With Brainpower
class Solution {
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        long dp[]=new long[n+1];

        for(int i=n-1;i>=0;i--){
            int points=questions[i][0];
            int skip=questions[i][1];
            int nextidx=i+skip+1;
            long nextpts=(nextidx<n) ? dp[nextidx] :0;

            dp[i]=Math.max(points+nextpts,dp[i+1]);
        }
        return dp[0];
    }
}
