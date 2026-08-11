class Solution {
    public int missingInteger(int[] nums) {
        
        int n = nums.length,sum=nums[0];
        int res = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            hm.put(nums[i],i);
        }

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                    sum+=nums[i];
            }else{
                break;
            }
        }
      
      while(sum>0){
        if(hm.containsKey(sum)){
            sum++;
        }else{
           res = sum;
           break;
        }
      }
      return res;

    }
}