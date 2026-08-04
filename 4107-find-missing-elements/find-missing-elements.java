class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int n = nums.length;

       Arrays.sort(nums);
        for(int n1 : nums){
            hs.add(n1);
        }

        for(int i=nums[0];i<=nums[n-1];i++){
            if(!hs.contains(i)){
                   ar.add(i);
            }
        }

        return ar;
    }
}