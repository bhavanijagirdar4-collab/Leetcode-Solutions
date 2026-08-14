class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxLen = 0;

        int n = s.length();

        int left = 0;

        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

            while(hm.get(ch)>2){
                char l = s.charAt(left);
                hm.put(l,hm.get(l)-1);

                if(hm.get(l)==0){
                    hm.remove(l);
                }
                left++;
            }

            int len = r-left+1;
            if(len>maxLen){
                maxLen = len;
            }
            
        }

        return maxLen;


    }
}