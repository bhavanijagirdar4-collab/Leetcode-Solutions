class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int num:nums1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ar = new ArrayList<>();
       
        for(int num : nums2){
            if(hm.containsKey(num)&&hm.get(num)>0){
                ar.add(num);
                hm.put(num, hm.get(num)-1);
            }
         
        }
       
       int res[] = new int[ar.size()];
       for(int i=0;i<ar.size();i++){
        res[i] = ar.get(i);
       }

       return res;

    }
}