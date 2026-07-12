class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];
        int b[] = arr.clone();
        HashMap<Integer, Integer> hs = new HashMap<>();
         Arrays.sort(b);
        int rank = 2;
        hs.put(b[0],1);

       
        
        for(int i=1;i<n;i++){
                 if(b[i]==b[i-1]){
                    hs.put(b[i],hs.get(b[i-1]));
                 }else{
                 hs.put(b[i],rank);
                 rank++;
                 }
        }

        for(int i=0;i<n;i++){
            b[i] = hs.get(arr[i]);
        }

        return b;
    }
}