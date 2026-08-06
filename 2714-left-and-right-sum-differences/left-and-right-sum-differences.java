class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length,sum1=0;
        int[] ls=new int[n];
        int[] rs = new int[n];
        int[] fin = new int[n];
        ls[0]= 0;rs[n-1]=0;

        for(int i=1;i<n;i++){
            sum1+=nums[i-1];
            ls[i]=sum1;
        }

             sum1 =0;

        for(int i=n-2;i>=0;i--){
            sum1 = sum1+nums[i+1];
            rs[i] = sum1;
        }

        for(int i=0;i<n;i++){
            fin[i]=Math.abs(ls[i]-rs[i]);
        }
        return fin;
    }
}