class Solution {
    static void bt(String tempString,int n,int open,int close,List<String> res){
        if(tempString.length()==2*n){
            res.add(tempString);
            return;
        }
        if(open<n){
            bt(tempString+'(',n,open+1,close,res);
        }
        if(close<open){
            bt(tempString+')',n,open,close+1,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        bt("",n,0,0,res);
        return res;
    }
}