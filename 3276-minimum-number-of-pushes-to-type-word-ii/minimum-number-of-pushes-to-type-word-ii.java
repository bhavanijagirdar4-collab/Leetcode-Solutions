class Solution {
    public int minimumPushes(String word) {
        
        int f[] = new int[26];
        for(char c : word.toCharArray()){
            f[c-'a']++;
        }

        Arrays.sort(f);

        int total = 0,c = 0;

        //c is adding the most frequent numbers to 1 press till 0-7

        for(int i=25;i>=0;i--){
            if(f[i]==0)
            break;

            int push = (c/8)+1;
            total = total+f[i]*push;
            c++;
        }

        return total;
    }
}