class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s1 = new StringBuilder();

for(String s : words){
        int total = 0;

        for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                total+=weights[ch - 'a'];
        }
        int remainder=total % 26;
            char mappedChar=(char)('z'-remainder);
            
            s1.append(mappedChar);
}

            return s1.toString();
    }
}