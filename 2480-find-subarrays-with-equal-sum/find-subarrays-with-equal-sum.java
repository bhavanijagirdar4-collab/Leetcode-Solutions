class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length-1;

       HashSet<Integer> hs = new HashSet<>();

       for(int i=0;i<n;i++){
         int re=nums[i]+nums[i+1];
          
          if(hs.contains(re)){
            return true;
          }
          hs.add(re);
       }
       return false;

    }
}