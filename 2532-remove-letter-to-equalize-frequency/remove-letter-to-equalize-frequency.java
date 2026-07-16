class Solution {
    public boolean equalFrequency(String word) {

        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]==0)
            continue;

            freq[i]--;
            if(dis(freq)){
                return true;
            }
            freq[i]++;
        }
        return false;
        
    }

    static boolean dis(int[] freq){
        int target = 0;

for(int f : freq){
        if(f==0)continue;

        if(target==0){
            target=f;
        }else if(target!=f){
            return false;
        }
    }
    return true;
    }
}