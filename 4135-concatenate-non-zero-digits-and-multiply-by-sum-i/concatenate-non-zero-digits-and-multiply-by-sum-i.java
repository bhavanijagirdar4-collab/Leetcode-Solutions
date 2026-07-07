class Solution {
    public long sumAndMultiply(int n) {

        if(n==0){
            return 0;
        }
        String s1 = String.valueOf(n).replace("0","");
        int r1 = Integer.parseInt(s1);int r2 = r1;
        long sum = 0;
        while(r1>0){
           int r = r1%10;
           sum = sum+r;
           r1/=10;
        }
        sum = sum*r2;
        return sum;

    }
}