class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int len = nums.length;

        for(int i=0;i<len;i++){
            hs.add(nums[i]);
        }

        int s = k;

        while(s>0){
            if(!hs.contains(s)){
                break;
            }
            s+=k;
        }

        return s;
    }
}