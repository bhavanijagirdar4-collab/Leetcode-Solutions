class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length,a=Integer.MAX_VALUE,b=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>b){
                b = nums[i];
            }
             if(nums[i]<a){
                a = nums[i];
            }
        }
          return gcd(a,b);
       
    }
    int gcd(int a,int b){
         while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}