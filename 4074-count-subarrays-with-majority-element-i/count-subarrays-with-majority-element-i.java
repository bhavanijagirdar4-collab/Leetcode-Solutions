class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int num[] = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                num[i]=1;
            }else{
                 num[i]=-1;
            }
        }


       int l=0,sum=0,c=0;
        while(l<n){
            sum=0;
            for(int i=l;i<n;i++){
              sum=sum+num[i];
              if(sum>0){
                c++;
              }
            }
            l++;
        }
        return c;
    }
}