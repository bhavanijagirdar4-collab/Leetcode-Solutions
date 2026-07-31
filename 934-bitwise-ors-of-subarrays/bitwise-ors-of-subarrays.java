class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        //Checking all subsets for Bitwise OR
        //assigning to the previous so that the OR operation continues 

        for(int n : arr){
            Set<Integer> curr = new HashSet<>();

            curr.add(n);

            for(int p : prev){
                curr.add(p|n);
            }

            prev = curr;
            ans.addAll(curr);
        }

        return ans.size();
    }
}