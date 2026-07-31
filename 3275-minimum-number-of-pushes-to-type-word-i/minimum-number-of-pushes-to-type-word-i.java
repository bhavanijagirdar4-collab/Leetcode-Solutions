class Solution {
    public int minimumPushes(String word) {
        char c[] = word.toCharArray();
        int n = c.length,total=0;


//here the characters in input is distinct...no need of frequency
        for(int i=0;i<n;i++){
             total = total+(i/8)+1;
        }

        return total;
    }
}