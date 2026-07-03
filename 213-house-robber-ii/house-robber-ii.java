import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int robFirst = bt(0, n - 2, nums, dp1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int robLast = bt(1, n - 1, nums, dp2);
        
        return Math.max(robFirst, robLast);
    }
    public int bt(int idx, int endIdx, int[] nums, int[] dp) {
        if (idx > endIdx) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        
        // Take current house
        int take = nums[idx] + bt(idx + 2, endIdx, nums, dp);
        // Do not take current house
        int nottake = bt(idx + 1, endIdx, nums, dp);

        return dp[idx] = Math.max(take, nottake);
    }
}