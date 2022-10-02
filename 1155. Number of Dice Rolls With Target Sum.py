class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int mod= (int)1e9+7;
        int[][]dp = new int[n+1][target+1];
        dp[0][0]=1;
        for(int dices=1; dices<=n; dices++){
            for(int t=1; t<=target; t++){
                int ans=0;
                for(int i=1; i<=k; i++){
                    if(t-i>=0)
                    ans=(ans%mod+(dp[dices-1][t-i]%mod)%mod);
                }
                dp[dices][t]=ans%mod;
            }
        }
        return dp[n][target];
    }
}
