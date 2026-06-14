class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l=0,r=0,maxLength=0,n=fruits.length;

        while(r<n){
              hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);
              if(hm.size()>2){
                 int leftFruit = fruits[l];
                hm.put(leftFruit, hm.get(leftFruit) - 1);
                if (hm.get(leftFruit) == 0) {
                    hm.remove(leftFruit);
                }
                l++;
              }else{
                maxLength = Math.max(maxLength,r-l+1);
              }
                 r++;
        }
           return maxLength;

    }
}