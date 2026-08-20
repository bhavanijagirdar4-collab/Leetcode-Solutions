class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int n = nums.length;
        int [] c = new int[n];

        a.add(nums[0]);
        b.add(nums[1]);

         for (int k=2;k<n;k++) {
            if (a.getLast()>b.getLast()) {
                a.add(nums[k]);
            } else {
                b.add(nums[k]);
            }
        }

        a.addAll(b);

        for(int i=0;i<n;i++){
            c[i] = a.get(i);
        }

        return c;


    }
}