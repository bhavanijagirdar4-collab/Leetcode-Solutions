class Solution {
    public int smallestNumber(int n, int t) {
        
        int i = n;
        int s = 0;

        while(i>0){
            if(pro(i)%t==0){
                  s = i;
                  break;
            }
            i++;
        }
        return s;
    }

    static int pro(int n){
        int p = 1;

        while(n>0){
            int d = n%10;
            p*=d;
            n/=10;
        }

       return p;
    }
}