class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxLen = 0;
        int left = 0,n=nums.length;

        for(int r=0;r<n;r++){
            int num  = nums[r];
            hm.put(num,hm.getOrDefault(num,0)+1);

            while(hm.get(num)>k){
                int l = nums[left];
                hm.put(l,hm.get(l)-1);
                left++;
            }

            maxLen = Math.max(maxLen,r-left+1);
        }

        return maxLen;
    }
}