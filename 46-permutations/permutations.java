class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        
        boolean used[] = new boolean[nums.length];
        generateSubsets( nums,used, res, subset);
        return res;
    }

    static void generateSubsets( int[] nums, boolean used[], List<List<Integer>> res, ArrayList<Integer> subset) {
    
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset)); 
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i])
            continue;

            used[i]=true;
            subset.add(nums[i]);
            generateSubsets( nums,used, res, subset);
             subset.remove(subset.size() - 1);
             used[i]=false;
        }
    }
    
}