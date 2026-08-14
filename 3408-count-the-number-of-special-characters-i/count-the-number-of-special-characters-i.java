class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        int n = word.length();
        HashSet<Character> set = new HashSet<>();
 
        for (char ch : word.toCharArray()) {
        set.add(ch);
        }

        for(char ch='a';ch<='z';ch++){
            char ch1 = Character.toUpperCase(ch);
            if(set.contains(ch)&& set.contains(ch1)){
                c++;
            }
        }

        return c;
    }
}