class Solution {
    public int countDigits(int num) {
        int c=0,n=num;

        while(num>0){
            int d = num%10;
            if(d!=0 && n%d==0){
                c++;
            }
            num/=10;
        }
        return c;
    }
}