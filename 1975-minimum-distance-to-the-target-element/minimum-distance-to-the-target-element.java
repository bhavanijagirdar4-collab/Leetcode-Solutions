class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;

        int current = 0;
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                current = Math.abs(i-start);
                mini = Math.min(current,mini);
            }
        }

        return mini;
    }
}