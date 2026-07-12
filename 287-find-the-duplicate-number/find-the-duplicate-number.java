class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;

          HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }

       for(int num : hs.keySet()){
        if(hs.get(num)>=2){
            s = num;
            
        }
       }

       return s;
    }
}