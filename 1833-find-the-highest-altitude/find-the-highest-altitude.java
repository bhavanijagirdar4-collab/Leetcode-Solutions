class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0,n = gain.length,sum=0;


        for(int i=0;i<n;i++){
         sum+=gain[i];
         if(sum>max){
            max = sum;
         }
        }
        return max;
    }
}