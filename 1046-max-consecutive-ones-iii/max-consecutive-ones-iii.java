class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,zeroes=0,maxLength=0,n=nums.length;
        
        for ( r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeroes++;
            }
            
            if (zeroes > k) {
                if (nums[l] == 0) {
                    zeroes--;
                }
                l++;
            }else{
            
            maxLength = Math.max(maxLength, r - l + 1);
        }
        }
        return maxLength;
    }
}