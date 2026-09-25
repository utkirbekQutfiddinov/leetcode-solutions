class Solution {
    public int minCostClimbingStairs(int[] costs) {
        int len=costs.length;
        int[] dp=new int[len+2];
        dp[len]=0;
        dp[len+1]=0;
        for(int i=len-1; i>=0; i--){
             dp[i] = costs[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0],dp[1]);
    }
}