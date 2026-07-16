class Solution {
    public int maxAscendingSum(int[] nums) {
       
        int n = nums.length;
        
         int sum = nums[0],maxsum=nums[0];
        for(int r=1;r<n;r++){
           
            if(nums[r]>nums[r-1]){
                sum+=nums[r];
            }else{
                maxsum = Math.max(maxsum,sum);
                sum = nums[r];
            }
        }

        return Math.max(maxsum,sum);
    }
}