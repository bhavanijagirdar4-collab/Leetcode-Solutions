class Solution {

    static int dis(int n,int ans[]){
        if(n==0)return 1;
        if(n<0)return 0;

        if(ans[n]!=-1)return ans[n];

         int onestep = dis(n-1,ans);
         int twostep = dis(n-2,ans);

         return ans[n] = onestep+twostep;
    
    }

    public int climbStairs(int n) {

        int ans[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=-1;
        }

         return dis(n,ans);
       
    }
}