class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n + 1];
        Arrays.fill(dp,-1);
        return terms(n,dp);
    }

    int terms(int n , int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=terms(n-1,dp)+terms(n-2,dp)+terms(n-3,dp);

        return dp[n];
    }
}