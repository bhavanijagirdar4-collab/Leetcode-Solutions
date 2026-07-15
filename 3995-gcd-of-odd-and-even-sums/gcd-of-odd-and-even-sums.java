class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1 = 0;
        int sum2 = 0;

        int n1 = n*2;

        for(int i=0;i<n1;i++){
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }

       return findGCD(sum2,sum1);

    }

  static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

}
   
