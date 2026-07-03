class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++)
            dp[i]=-1;
        
        return bt(0,nums,dp);
    }
    public int bt(int idx,int[] nums,int[] dp){
        if(idx>=nums.length)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        // Take
        int take=nums[idx]+bt(idx+2,nums,dp);
        // Not Take
        int nottake=bt(idx+1,nums,dp);

        return dp[idx]=Math.max(take,nottake);
    }
}