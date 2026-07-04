class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length,maxFreq=0,freq=0,res=-1;

        Arrays.sort(nums);

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

       for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                 freq = hm.get(nums[i]);
               
                if (freq > maxFreq) {
                    maxFreq = freq;
                    res = nums[i];
                }
            }
        }
        return res;
    }
}