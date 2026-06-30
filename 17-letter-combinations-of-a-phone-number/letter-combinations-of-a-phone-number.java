class Solution {
    public void bt(String digits, int idx, StringBuilder ans,List<String> res,Map<Character,String> digitLetter){
        if(idx==digits.length()){
            res.add(ans.toString());
            return;
        }
        String letters=digitLetter.get(digits.charAt(idx));
        for(char letter:letters.toCharArray()){
            ans.append(letter);
            bt(digits,idx+1,ans,res,digitLetter);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        Map<Character,String> digitLetter=new HashMap<>();
        digitLetter.put('2',"abc");
        digitLetter.put('3',"def");
        digitLetter.put('4',"ghi");
        digitLetter.put('5',"jkl");
        digitLetter.put('6',"mno");
        digitLetter.put('7',"pqrs");
        digitLetter.put('8',"tuv");
        digitLetter.put('9',"wxyz");
        bt(digits,0,new StringBuilder(),res,digitLetter);
        return res;
    }
}