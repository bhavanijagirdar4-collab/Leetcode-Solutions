class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }

        for(int num : hs.keySet()){
            if(hs.get(num)==2){
                a.add(num);
            }
        }

        return a;

    }
}