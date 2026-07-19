class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        if(hm.containsKey(target)){
            return hm.get(target);
        }else{
            return -1;
        }
    }
}