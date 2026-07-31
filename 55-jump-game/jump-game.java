class Solution {
    public boolean canJump(int[] nums) {
        int maxreach = 0,n = nums.length;

        for(int i=0;i<n;i++){
            if(maxreach<i){
                  return false;
            }

            maxreach = Math.max(maxreach,i+nums[i]);

            if(maxreach>=n-1){
                return true;
            }

            
        }

        return false;
    }
}