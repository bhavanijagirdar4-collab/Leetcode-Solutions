class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        int n = cost.length;

        if(n==2){
            sum= cost[0]+cost[1];
        }else if(n==1){

            sum = cost[0];
        }
            else{

        Arrays.sort(cost);
       int c =0;

        for(int i=n-1;i>=0;i--){
            c++;
            if(c%3!=0){
                sum+=cost[i];
            }
        }
          

        }
         return sum;

    }
}