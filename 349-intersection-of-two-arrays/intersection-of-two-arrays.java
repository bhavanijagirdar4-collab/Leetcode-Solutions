class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs = new HashSet<>();
        HashSet<Integer>ans = new HashSet<>();

        for (int num:nums1) {
            hs.add(num);
        }

       int n = nums2.length;
        for(int i=0;i<n;i++){
            if(hs.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int ans1[] = new int[ans.size()];int j=0;
        for(int num : ans){
            ans1[j++] = num;
        }

        return ans1;
    }
}