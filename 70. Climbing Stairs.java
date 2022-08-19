class Solution {
    public static int [] dp = new int[46]; 
    public int climbStairs(int n) {   
        if(n < 0) return 0;
        if(n == 0) return 1;        
        if(n == 1) return 1;
        
        if(dp[n] != 0) return dp[n];
        
        int one = climbStairs(n-1);
        int two = climbStairs(n-2);
        return dp[n] = one + two;   
        
    }
}
