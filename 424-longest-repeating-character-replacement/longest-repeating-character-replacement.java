class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        Map<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int  maxFreq = 0;

        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            hm.put(c,hm.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,hm.get(c));

            while((right-left+1)-maxFreq>k){
                char lc = s.charAt(left);
                hm.put(lc,hm.get(lc)-1);
                if(hm.get(lc)==0){
                    hm.remove(lc);
                }
                left++;
            }
            int len = right-left+1;
            if(len>maxLen){
                maxLen = len;
            }
        }

        return maxLen;
    }
}