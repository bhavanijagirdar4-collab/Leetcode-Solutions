class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int indi = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = nums.length;

        int left[] = new int[n];
        int right[] = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                left[i]=max;
            }else{
                left[i]=max;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i]<min){
                min = nums[i];
                right[i]=min;
            }else{
                right[i]=min;
            }
        }

        for(int i=0;i<n;i++){
            nums[i]=left[i]-right[i];
            if(nums[i]<=k){
                indi = i;
                break;
            }
        }

        return indi;




    }
}