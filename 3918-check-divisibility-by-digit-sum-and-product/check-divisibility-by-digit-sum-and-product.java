class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1,temp=n;

        while(temp>0){
            int d = temp%10;
            sum+=d;
            pro*=d;
            temp/=10;
        }

        if(n%(sum+pro)==0){
            return true;
        }else{
             return false;
        }
    }
}