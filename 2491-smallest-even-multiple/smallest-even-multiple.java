class Solution {
    public int smallestEvenMultiple(int n) {
        int idx=2,res=0;
        while(true){
            if(idx%2==0 && idx%n==0){
                res =  idx;
                break;
            }
            idx++;
        }
        return res;
    }
}