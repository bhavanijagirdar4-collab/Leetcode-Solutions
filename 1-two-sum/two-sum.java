class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int len = nums.length;

        for(int i=0;i<len;i++){
            int c = target-nums[i];
            if(!hm.containsKey(c)){
                hm.put(nums[i],i);
            }else{
                return new int[]{hm.get(c),i};
            }
        }

        return new int[]{};
    }
}