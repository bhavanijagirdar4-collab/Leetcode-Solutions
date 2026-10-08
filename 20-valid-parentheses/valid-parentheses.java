class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hpp = new HashMap<>();
        hpp.put('(',')');
        hpp.put('{','}');
        hpp.put('[',']');

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(hpp.containsKey(c)){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char ch1 = st.pop();
                if(c!=hpp.get(ch1)){
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}